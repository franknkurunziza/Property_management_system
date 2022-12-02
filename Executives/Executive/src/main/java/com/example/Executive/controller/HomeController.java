package com.example.Executive.controller;

import com.example.Executive.model.Tenant;
import com.example.Executive.service.TenantService;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TenantService tenantService;

    @GetMapping ("/PropertySearch")
    public String dashboard(){return "/SearchProperty";}

    @GetMapping("/login")
    public String index(){
        return "/login.html";
    }

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

    @GetMapping("apply")
    public String applying(){
        return "";
    }

    @GetMapping("/user/payment")
    public String payment(){
        return "/userdash";
    }
}
