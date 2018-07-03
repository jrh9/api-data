package com.jrh.api.data.service.rs;

import com.jrh.api.data.service.ApiDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiDataController {

    @Autowired
    ApiDataService apiDataService;

    @GetMapping("/")
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok()
                .body(apiDataService.getZillowSearchResults());

    }
}

