package com.testingdeployment.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {

    @GetMapping("/test")
    public ResponseEntity<String> testingAPI(){
        return new ResponseEntity<>("Running successfully", HttpStatus.OK);
    }

}
