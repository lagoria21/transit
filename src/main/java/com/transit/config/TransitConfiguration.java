package com.transit.config;

import com.transit.config.properties.ServicesProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class TransitConfiguration {
    private final ServicesProperties servicesProperties;

    public TransitConfiguration(ServicesProperties servicesProperties) {
        this.servicesProperties = servicesProperties;
    }

    @Bean(name="transitClient")
    public WebClient createWebClient(){
        return WebClient.builder().baseUrl(servicesProperties.getTransitUrl()).build();
    }
}
