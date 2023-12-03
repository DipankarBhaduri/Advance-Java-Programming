package com.HRNavigator.services;

import com.HRNavigator.handlers.RepositoryHandler;
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
            repositoryHandler.saveDocument(clazz, obj);
            return new ResponseEntity<>("Save Successfully", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Failed!! Exception Occurred During Save", HttpStatus.OK);
        }
    }
}
