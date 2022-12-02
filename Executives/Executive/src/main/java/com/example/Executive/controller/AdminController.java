package com.example.Executive.controller;
import com.example.Executive.model.Tenant;
import com.example.Executive.service.TenantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.http.HttpResponse;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TenantService tenantService;

    @GetMapping("/PM_Dashboard")
    public String home(){
        return "/PM_Dashboard";
    }

//    @PostMapping("/create_Tenants")
//    public String createTenants(@RequestBody Tenant tenant, HttpResponse response){
//        tenantService.createTenant(tenant);
//        return "Thank you for posting";
//    }

    @GetMapping("/PM_Reports")
    public String reports(){
        return "/PM_Reports";
    }

    @GetMapping("/PM_TenantApplications")
    public String applications(){
        return "/PM_TenantApplications";
    }

    @GetMapping("/PM_ManageProperties")
    public String manageProperty(){
        return "/PM_ManageProperties";
    }


}
