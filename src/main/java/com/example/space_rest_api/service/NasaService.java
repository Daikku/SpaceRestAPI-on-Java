package com.example.space_rest_api.service;

import com.example.space_rest_api.client.NasaAPIClient;
import com.example.space_rest_api.dto.ApodResponse;
import org.springframework.stereotype.Service;


@Service
public class NasaService {
    private final NasaAPIClient apiClient;

    public NasaService(NasaAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApodResponse getDailyApod() {
        return apiClient.getApod();
    }
}
