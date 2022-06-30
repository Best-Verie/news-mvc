package com.example.newsjsp.dao;

public class Article {
    private Long id;
    private String title;
    private String description;
    private String content;
    private String urlToImage;

    public Article() {
    }

    public Article(Long id, String title, String description, String content, String urlToImage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.urlToImage = urlToImage;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
}
