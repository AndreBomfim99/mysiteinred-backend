package com.mysiteinred.backend.model;

public class Article {
    private Long id;
    private String title;
    private String summary;
    private String content;
    private String imageUrl;
    private String date;

    public Article() {}

    public Article(Long id, String title, String summary, String content, String imageUrl, String date) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.content = content;
        this.imageUrl = imageUrl;
        this.date = date;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}


