package com.HRNavigator.services;

import com.HRNavigator.handlers.RepositoryHandler;
import com.HRNavigator.models.AccountBook;
import com.HRNavigator.models.ModificationLog;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SaveRestServices {

    @Autowired
    private RepositoryHandler repositoryHandler;

    /**
     * Processes a save call by converting the provided object to the specified class and saving it to the repository.
     *
     * @param clazz  The Class object representing the type to convert the object to.
     * @param object The object to be converted and saved.
     * @return ResponseEntity indicating the result of the save operation.
     */
    public ResponseEntity<String> processSaveCall (Class <?> clazz, Object object) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Object obj = objectMapper.convertValue(object, clazz);
            return saveWithModificationLog(clazz, obj);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Failed!! Exception Occurred During Save", HttpStatus.OK);
        }
    }

    /**
     * Saves an object with modification logging. The original and modified objects are recorded in a ModificationLog.
     *
     * @param clazz The Class object representing the type of the object to be saved.
     * @param obj   The object to be saved with modification logging.
     * @return ResponseEntity indicating the result of the save operation.
     */
    private ResponseEntity<String> saveWithModificationLog(Class <?> clazz, Object obj) {
        if (obj != null) {
            try {
                updateAccountBook(clazz, obj);
                ModificationLog modificationLog = new ModificationLog();
                modificationLog.setOriginalObject(null);
                modificationLog.setModifiedObject(obj);

                repositoryHandler.saveDocument(ModificationLog.class, modificationLog);
                repositoryHandler.saveDocument(clazz, obj);

                return new ResponseEntity<>("Save Successfully", HttpStatus.OK);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            return new ResponseEntity<>("Error Occurred", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Error Occurred", HttpStatus.BAD_REQUEST);
    }

    /**
     * Updates the AccountBook with the new object and sets the SrNumber dynamically using reflection.
     *
     * @param clazz The Class object representing the type of the object to be saved.
     * @param obj   The object to be saved.
     */
    private void updateAccountBook(Class<?> clazz, Object obj) {
        String code = getSrCode(clazz);
        List<AccountBook> accountBooks = (List<AccountBook>) repositoryHandler.findDocumentByFieldName(AccountBook.class, "className", clazz.getName());
        AccountBook accountBook = null;

        if (accountBooks == null || accountBooks.size() == 0) {
            accountBook = new AccountBook();
            accountBook.setClassName(clazz.getName());
            accountBook.setSrNumber(code + "-" + 1);
        } else {
            try {
                accountBook = accountBooks.get(0);
                String srNumber = accountBook.getSrNumber();
                int temp = Integer.parseInt(srNumber.substring(code.length() + 1));
                accountBook.setSrNumber(code + "-" + ++temp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            java.lang.reflect.Method setSrNumberMethod = clazz.getMethod("setSrNumber", String.class);
            setSrNumberMethod.invoke(obj, accountBook.getSrNumber());
        } catch (NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        repositoryHandler.saveDocument(AccountBook.class, accountBook);
    }

    /**
     * Gets the SrCode based on the uppercase characters in the class name.
     *
     * @param clazz The Class object representing the type.
     * @return The generated SrCode.
     */
    private String getSrCode(Class<?> clazz) {
        String ans = "";
        if (clazz != null) {
            String className = clazz.getName();
            String[] values = className.split("s.");
            if (values != null && values.length > 0 ) {
                for (int i = 0; i < values[values.length - 1].length(); i++) {
                    char ch = values[values.length - 1].charAt(i);
                    if (ch >= 'A' && ch <= 'Z') {
                        ans += ch;
                    }
                }
            }
        }
        return ans;
    }
}
