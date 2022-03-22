package com.rfl.itismyway.controller;

import com.rfl.itismyway.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public HomeController(UserService service) {
        this.service = service;
    }

    private UserService service;

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("users", service.getAll());
        return "home";
    }
}
