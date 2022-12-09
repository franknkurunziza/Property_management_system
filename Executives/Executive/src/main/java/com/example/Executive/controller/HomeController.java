package com.example.Executive.controller;

import com.example.Executive.model.Tenant;
import com.example.Executive.model.User;
import com.example.Executive.service.CustomUserDetailsService;
import com.example.Executive.service.TenantService;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TenantService tenantService;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @GetMapping(value = "/")
    public String dashboard(){return "/SearchProperty";}

    @GetMapping("/login")
    public String index(){
        return "/login";
    }

    //@GetMapping("/user/about")

    @PostMapping(value="/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createTenants(@RequestBody Tenant tenant){
        tenantService.createTenant(tenant);
        return "Thank you for posting";
    }


    @SuppressFBWarnings("ENTITY_LEAK")
    @GetMapping("/tenants")
    public List<Tenant> properties(){
        List<Tenant> tenants=tenantService.getTenants();
        return tenants;
    }



    @GetMapping("/user")
    public String user(){
        return "/userdash";
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userDetailsService.createUserAcc(user);
    }

    @GetMapping("apply")
    public String applying(){
        return "";
    }

    @GetMapping("/user/profile")
    public String userProfile(){
        return "/Profile";
    }
    
    @GetMapping("/user/inbox")
    public String userInbox(){
        return "/Inbox";
    }

    @GetMapping("/user/Payments")
    public String userPayment(){
        return "/Payment";
    }
}
