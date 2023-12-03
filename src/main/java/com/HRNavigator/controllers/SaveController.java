package com.HRNavigator.controllers;

import com.HRNavigator.services.SaveRestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/rest")
public class SaveController {

    @Autowired
    private SaveRestServices saveRestServices;

    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody Object object) {
        try {
            if (object instanceof LinkedHashMap) {
                String className = (String) ((LinkedHashMap<?, ?>) object).get("_class");
                if (className != null) {
                    Class<?> clazz = Class.forName(className);
                    if (clazz != null) {
                        return saveRestServices.processSaveCall(clazz, object);
                    } else {
                        return new ResponseEntity<>("class is null", HttpStatus.BAD_REQUEST);
                    }
                } else {
                    return new ResponseEntity<>("_class property not found", HttpStatus.BAD_REQUEST);
                }
            } else {
                return new ResponseEntity<>("Invalid Object format", HttpStatus.BAD_REQUEST);
            }
        } catch (ClassNotFoundException e) {
            return new ResponseEntity<>("Class not found: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
