package com.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("greeting", "main출력");
        return "hello";

    }

    @GetMapping("/newPage")
    public String newPage(Model model) {
        model.addAttribute("newPage", "newPage이동");
        return "newPage";
    }

    @GetMapping("/rgtData")
    public String rgtData(@RequestParam String userName, Model model) {
        model.addAttribute("userName", userName);
        return "newPage";
    }

    @PostMapping("/rgtPostData")
    public String rgtPostData(@RequestParam ("userName") String username, @RequestParam ("userId") String userId, Model model) {
        model.addAttribute("userName", username);
        model.addAttribute("userId", userId);
        return "newPage";
    }

    @PostMapping("/rgtPostDatas")
    public String rgtPostDatas(@RequestParam ("userName") String username, @RequestParam ("userId") String userId, @RequestParam ("password") String password, Model model) {
        model.addAttribute("userName", username);
        model.addAttribute("userId", userId);
        model.addAttribute("password", password);
        return "newPage";
    }
}
