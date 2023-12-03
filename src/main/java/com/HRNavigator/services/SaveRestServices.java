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
    public ResponseEntity<String> processSaveCall (Class <?> clazz, Object object) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Convert the LinkedHashMap to an instance of the specified class (clazz)
        Object obj = objectMapper.convertValue(object, clazz);

        // Assuming repositoryHandler is an instance of your repository handling class
        repositoryHandler.saveDocument(clazz, obj);

        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }
}
