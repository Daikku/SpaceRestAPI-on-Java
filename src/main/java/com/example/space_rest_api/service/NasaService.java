package com.example.space_rest_api.service;

import com.example.space_rest_api.client.NasaAPIClient;
import com.example.space_rest_api.dto.ApodResponse;
import com.example.space_rest_api.entity.ApodEntity;
import com.example.space_rest_api.repository.ApodRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;


@Service
public class NasaService {
    private final NasaAPIClient apiClient;
    private final ApodRepository repository;

    public NasaService(NasaAPIClient apiClient, ApodRepository repository) {
        this.apiClient = apiClient;
        this.repository = repository;
    }

    @Transactional
    public ApodResponse getDailyApod() {
        LocalDate today = LocalDate.now();

        return repository.findByDate(today)
            .map(this::mapToResponse)
            .orElseGet(() -> {
                ApodResponse response = apiClient.getApod();
                saveApodData(response);
                return response;
            });
    }

    private void saveApodData(ApodResponse response) {
        ApodEntity entity = new ApodEntity(
            response.title(),
            response.copyright(),
            response.explanation(),
            response.url(),
            response.hdurl(),
            response.media_type(),
            LocalDate.parse(response.date())
        );
        repository.save(entity);
    }

    private ApodResponse mapToResponse(ApodEntity entity) {
        return new ApodResponse(
            entity.getCopyright(),
            entity.getDate().toString(),
            entity.getExplanation(),
            entity.getHdurl(),
            entity.getMediaType(),
            "v1",
            entity.getTitle(),
            entity.getUrl()
        );
    }
}
