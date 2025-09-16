package com.spring.test.controller;

import com.spring.test.domain.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sign_up {

    @GetMapping("/signUp")
    public String signUp(UserVO userVO, Model model) {


        model.addAttribute("userVO", userVO);

        return "join/signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@RequestParam String userId,
                         @RequestParam String userName,
                         @RequestParam String UserNickName,
                         @RequestParam String UserPswd,
                         @RequestParam String UserMail,
                         Model model) {

        return "join/signUp";

    }
}
