package com.example.newsjsp.Controller;

import com.example.newsjsp.dao.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @GetMapping("/all")
    public String getTodos(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Todo[]> todos = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos", Todo[].class);
        model.addAttribute("todos", todos.getBody());
        return "todo/allTodo";
    }

//    @GetMapping
}
