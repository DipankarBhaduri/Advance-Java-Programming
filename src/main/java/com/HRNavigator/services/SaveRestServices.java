package com.HRNavigator.services;

import com.HRNavigator.handlers.RepositoryHandler;
import com.HRNavigator.models.ModificationLog;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
            ModificationLog modificationLog = new ModificationLog();
            modificationLog.setOriginalObject(obj);
            modificationLog.setModifiedObject("first time data getting saved");
            repositoryHandler.saveDocument(ModificationLog.class, modificationLog);
            repositoryHandler.saveDocument(clazz, obj);
            return new ResponseEntity<>("Save Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error Occurred", HttpStatus.BAD_REQUEST);
        }
    }
}
