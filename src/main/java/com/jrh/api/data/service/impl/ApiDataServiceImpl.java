package com.jrh.api.data.service.impl;

import com.jrh.api.data.service.ApiDataService;
import com.jrh.api.data.service.ZillowApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiDataServiceImpl implements ApiDataService {

    @Autowired
    ZillowApiService zillowApi;

    @Override
    public String getZillowSearchResults() {
        String address = "2114+Bigelow+Ave";
        String citystatezip="Seattle%2C+WA";
        String rentzestimate = "";
        return zillowApi.getSearchResults(address, citystatezip, rentzestimate);

    }




}
