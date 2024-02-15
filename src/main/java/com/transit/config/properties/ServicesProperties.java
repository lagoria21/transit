package com.transit.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServicesProperties {

    @Value("${transit.url}")
    private String transitUrl;

    public String getTransitUrl(){
        return transitUrl;
    }
}
