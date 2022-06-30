package com.example.newsjsp.dao;

public class Comment {
    private Long id;
    private String comment;
    private Long articleId;

    public Comment() {
    }

    public Comment(Long id, String comment, Long articleId) {
        this.id = id;
        this.comment = comment;
        this.articleId = articleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}
