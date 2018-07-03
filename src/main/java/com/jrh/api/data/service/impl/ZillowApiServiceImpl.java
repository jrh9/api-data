package com.jrh.api.data.service.impl;

import com.jrh.api.data.service.ZillowApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

@Service
public class ZillowApiServiceImpl implements ZillowApiService {

    @Value("${zillow.api.key}")
    String zillowApiKey;

    @Override
    public String getSearchResults(String address, String cityStateZip, String rentZestimate) {

        String url = createUrl(address, cityStateZip, rentZestimate);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        response.close();

        return value;
    }

    private String createUrl(String address, String cityStateZip, String rentZestimate) {
        String url = "http://www.zillow.com/webservice/GetSearchResults.htm?" +
                "zws-id=" + zillowApiKey +
                "&address=" + address +
                "&citystatezip=" + cityStateZip;

        if (rentZestimate == "true") {
            url += "&rentzestimate=" + rentZestimate;
        }
        return url;
    }
}
