package com.example.thympages.controller;


import com.example.thympages.model.User;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dash")
    public String home(){

        return "/PM_Dashboard";
    }

    @GetMapping("/applications")
    public String applications(){
        return "/AllApplication";
    }

    @GetMapping("/properties")
    public String properties(){
        return "/Properties";
    }

    @PostMapping("/create_Tenants")
    public String createTenants(){
        return "";
    }

}
