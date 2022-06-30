package com.example.newsjsp.Controller;

import com.example.newsjsp.dao.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/comments")
public class CommentResource {
    @PostMapping("/save")
    public String saveComment(String title, Long articleId, Model model){
        RestTemplate restTemplate =  new RestTemplate();
        Comment comment = new Comment();
        comment.setComment(title);
        comment.setArticleId(articleId);
        restTemplate.postForObject("http://localhost:8000/comment/create", comment, Comment.class);
//        model.addAttribute("comment", newComment);
        return "redirect:/articles/viewOne/" + articleId;
    }
}
