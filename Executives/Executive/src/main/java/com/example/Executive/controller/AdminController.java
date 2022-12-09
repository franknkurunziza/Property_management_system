package com.example.Executive.controller;
import com.example.Executive.model.Owner;
import com.example.Executive.model.Property;
import com.example.Executive.model.Tenant;
import com.example.Executive.service.OwnerService;
import com.example.Executive.service.PropertyService;
import com.example.Executive.service.TenantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TenantService tenantService;

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/PM_Dashboard")
    public String home(Model model){
        List<Tenant> tenants=tenantService.getTenants();
        List<Property> properties=propertyService.getProperties();
        List<Owner> owners=ownerService.getOwners();
        model.addAttribute("owners",owners);
        model.addAttribute("properties",properties);
        model.addAttribute("tenants", tenants);
        return "/PM_Dashboard";
    }

    @PostMapping("/create_Tenants")
    public String createTenants(@RequestBody Tenant tenant){
        tenantService.createTenant(tenant);
        return "";
    }

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

    @GetMapping("/AddProperty")
    public String addProperty(){
        return "/AddProperty";
    }

    @GetMapping("/CreatePropertyReport")
    public String createPropertyReport(){ return "/CreatePropertyReport";}

}
