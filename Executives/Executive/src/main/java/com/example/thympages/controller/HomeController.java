package com.example.thympages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping ("/")
    public String dashboard(){return "/SearchProperty.html";}

    @GetMapping("/login")
    public String index(){
        return "/login";
    }

    @GetMapping("/user")
    public String user(){
        return "/userdash";
    }

    @GetMapping("apply")
    public String applying(){
        return "";
    }

    @GetMapping("/user/payment")
    public String payment(){
        return "/userdash";
    }
}
