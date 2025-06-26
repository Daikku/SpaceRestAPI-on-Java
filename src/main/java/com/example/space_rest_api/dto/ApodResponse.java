package com.example.space_rest_api.dto;


public record ApodResponse(
    String copyright,
    String date,
    String explanation,
    String hdurl,
    String media_type,
    String service_version,
    String title,
    String url
) {}

