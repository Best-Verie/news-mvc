package com.example.newsjsp.dao;

public class CreateCommentDao {
    private Long id;
    private String comment;
    private Article article;

    public CreateCommentDao() {
    }

    public CreateCommentDao(Long id, String comment, Article article) {
        this.id = id;
        this.comment = comment;
        this.article = article;
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

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
