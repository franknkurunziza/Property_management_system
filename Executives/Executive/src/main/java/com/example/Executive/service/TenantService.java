package com.example.Executive.service;

import com.example.Executive.model.Tenant;
import com.example.Executive.repository.TenantRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    public Tenant createTenant(Tenant tenant){
        return tenantRepository.save(tenant);
    }

    public List<Tenant> getTenants(){
        return (List<Tenant>) tenantRepository.findAll();
    }


}
