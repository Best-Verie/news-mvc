package com.example.newsjsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("auth")
public class AuthController {
    @GetMapping
    public String auth() {
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(String email, String password) {
        System.out.println(email + " " + password);
        return "redirect:todo/allTodo";
    }
}
