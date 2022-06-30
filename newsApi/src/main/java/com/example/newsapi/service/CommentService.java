package com.example.newsapi.service;

import com.example.newsapi.dto.CommentDto;
import com.example.newsapi.model.Article;
import com.example.newsapi.model.Comment;
import com.example.newsapi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleService articleService;

    public Comment createComment(CommentDto commentDto){

        Comment comment = new Comment();
        comment.setComment(commentDto.getComment());
        Article article = articleService.getArticleById(commentDto.getArticleId()).get();
        comment.setArticle(article);

        return commentRepository.save(comment);

    }

    public Comment getCommentById(Long id){
        return commentRepository.findById(id).get();
    }

    public List<Comment> getCommentsByArticleId(Long id){
        List<Comment> comments =  commentRepository.findAllByArticleId(id);
        if(comments.isEmpty()){
           throw new RuntimeException("No comments found for this article");
        }
        return comments;
    }

    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }


}
