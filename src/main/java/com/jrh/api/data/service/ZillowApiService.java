package com.jrh.api.data.service;

public interface ZillowApiService {

    String getSearchResults(String address, String cityStateZip, String rentZestimate);
}
