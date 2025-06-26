package com.example.space_rest_api.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.example.space_rest_api.config.NasaAPIProperties;
import com.example.space_rest_api.dto.ApodResponse;


@Component
public class NasaAPIClient {
    private final NasaAPIProperties nasaProperties;

    public NasaAPIClient(NasaAPIProperties nasaProperties) {
        this.nasaProperties = nasaProperties;
    }

    public ApodResponse getApod() {
        RestTemplate restTemplate = new RestTemplate();
        String url = nasaProperties.getUrl() + "?api_key=" + nasaProperties.getKey();
        return restTemplate.getForObject(url, ApodResponse.class);
    }
}