package com.simon.clubmanager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {


    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }


    @GetMapping("/login")
    public String loginPage(){
        return "loginPage";
    }
}
