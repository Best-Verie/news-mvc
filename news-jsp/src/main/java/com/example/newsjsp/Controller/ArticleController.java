package com.example.newsjsp.Controller;

import com.example.newsjsp.dao.Article;
import com.example.newsjsp.dao.Comment;
import com.example.newsjsp.dao.CreateCommentDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("articles")
public class ArticleController {
    @GetMapping
    public String allArticles(Model model){
        RestTemplate restTemplate = new RestTemplate();
        Article article[] = restTemplate.getForObject("http://localhost:8000/article/all", Article[].class);
        model.addAttribute("articles",article);
        return "article/allArticles";
    }

    @GetMapping("viewOne/{id}")
    public String viewOneArticle(@PathVariable Long id, Model model){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8000/article/" + id;
        Article article = restTemplate.getForObject(url, Article.class);

        model.addAttribute("article", article);
        String url2  = "http://localhost:8000/comment/article/" + id;
        Comment comment[] = restTemplate.getForObject(url2, Comment[].class);
        model.addAttribute("comments",comment);
        System.out.println(comment[0].getComment());
        return "article/viewOneArticle";
    }


    @PostMapping("/saveComment")
    public String saveComment(String comment, Long articleId, Model model){
        System.out.println("comment" + comment + "article" + articleId);
        RestTemplate restTemplate =  new RestTemplate();
        Comment newComment = new Comment();
        newComment.setComment(comment);
        System.out.println("new comment" + newComment.getComment());
        newComment.setArticleId(articleId);

        String articleUrl = "http://localhost:8000/article/" + articleId;

        Article article = restTemplate.getForObject(articleUrl, Article.class);

//        System.out.println();

        CreateCommentDao createCommentDao = new CreateCommentDao();
        createCommentDao.setComment(comment);
        createCommentDao.setArticle(article);

        CreateCommentDao commentToSave = restTemplate.postForObject("http://localhost:8000/comment/create", createCommentDao, CreateCommentDao.class);
        System.out.println("comment saved" + commentToSave.getComment());
        return "redirect:/articles/viewOne/" + articleId;
    }

    @GetMapping("/comments")
    public String getCommentsByArticle(String articleId, Model model){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8000/comment/article/" + articleId;
        Comment comment[] = restTemplate.getForObject(url, Comment[].class);
        model.addAttribute("comments",comment);
        return "redirect:/articles/viewOne/" + articleId;
    }


}
