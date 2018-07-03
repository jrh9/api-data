package com.jrh.spring.boot.starter.app.service.rs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok()
                .body("Hello World");

    }
}

