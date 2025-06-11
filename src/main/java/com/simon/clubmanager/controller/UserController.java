package com.simon.clubmanager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simon.clubmanager.models.User;

@Controller
@RequestMapping("")
public class UserController {
    
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        logger.info("Loading login page");
        model.addAttribute("user", new User());
        return "logInPage";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user){
        logger.info("Login attempt for user: {}", user.getMail());
        // Add your login logic here
        return "mainPage";  // Redirect back to main page after login
    }
}
