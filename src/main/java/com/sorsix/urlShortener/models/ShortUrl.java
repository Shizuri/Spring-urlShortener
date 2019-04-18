package com.sorsix.urlShortener.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class ShortUrl {

    private @Id @GeneratedValue Long shortUrl;
    private String originalUrl;

    public ShortUrl(){

    }

    public ShortUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Long getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(Long shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    @Override
    public String toString() {
        return "ShortUrl{" +
                "shortUrl=" + shortUrl +
                ", originalUrl='" + originalUrl + '\'' +
                '}';
    }
}
