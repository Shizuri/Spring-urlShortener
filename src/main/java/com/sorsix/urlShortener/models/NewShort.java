package com.sorsix.urlShortener.models;

public final class NewShort {
    private String newShortUrl;

    public NewShort(){

    }

    public NewShort(String newShortUrl) {
        this.newShortUrl = newShortUrl;
    }

    public String getNewShortUrl() {
        return newShortUrl;
    }

    public void setNewShortUrl(String newShortUrl) {
        this.newShortUrl = newShortUrl;
    }

    @Override
    public String toString() {
        return "NewShort{" +
                "newShortUrl='" + newShortUrl + '\'' +
                '}';
    }
}
