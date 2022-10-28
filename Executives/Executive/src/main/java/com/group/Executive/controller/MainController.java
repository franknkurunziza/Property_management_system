package com.group.Executive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/Dashboard")
    public String dashboard(){
        return "index.jsp";
    }
    @GetMapping("/login")
    public String login(){
        return "index.jsp";
    }
    @PostMapping("/")
    public String authorize(){
        return "index.jsp";
    }
    @PostMapping("/addProperty")
    public String createProperty(){return "";}

    @DeleteMapping("/deleteProperty")
    public String deleteProperty(){

        return "";
    }

}
