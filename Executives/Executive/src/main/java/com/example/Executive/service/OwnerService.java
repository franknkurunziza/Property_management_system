package com.example.Executive.service;

import com.example.Executive.model.Owner;
import com.example.Executive.repository.OwnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> getOwners(){
        return (List<Owner>)ownerRepository.findAll();
    }
}
