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

    /**
     * Saves data based on the provided object. This endpoint is designed to handle
     * generic data saving for dynamic classes specified in the input object.
     *
     * @param object The input object containing information for saving data.
     *               It is expected to be an instance of LinkedHashMap.
     *               It should have a "className" property specifying the fully qualified class name.
     * @return ResponseEntity indicating the result of the save operation.
     *         If successful, it returns a "DONE" message with HTTP status OK.
     *         If there are validation or processing errors, appropriate error messages
     *         along with the corresponding HTTP status codes are returned.
     */
    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody Object object) {
        try {
            if (object instanceof LinkedHashMap) {
                String className = (String) ((LinkedHashMap<?, ?>) object).get("className");
                className = "com.HRNavigator.models."+className;
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
