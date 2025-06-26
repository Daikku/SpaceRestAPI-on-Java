package com.example.space_rest_api.entity;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "apod_data")
public class ApodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String copyright;

    @Column(columnDefinition = "TEXT")
    private String explanation;

    @Column(length = 255)
    private String url;

    @Column(length = 255)
    private String hdurl;

    @Column(length = 10, name = "media_type")
    private String mediaType;
    
    private LocalDate date;

    public ApodEntity() {}

    public ApodEntity(String title, String copyright, String explanation, String url, 
                     String hdurl, String mediaType, LocalDate date) {
        this.title = title;
        this.copyright = copyright;
        this.explanation = explanation;
        this.url = url;
        this.hdurl = hdurl;
        this.mediaType = mediaType;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
