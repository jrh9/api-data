package com.jrh.api.data.service.impl;

import com.jrh.api.data.service.ApiDataService;
import org.springframework.stereotype.Service;

@Service
public class ApiDataServiceImpl implements ApiDataService {

    @Override
    public String helloWorld() {
        return "Hello World from service!";
    }
}
