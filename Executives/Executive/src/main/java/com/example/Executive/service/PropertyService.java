package com.example.Executive.service;

import com.example.Executive.model.Property;
import com.example.Executive.repository.PropertyRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property createProperty(Property property){
        return propertyRepository.save(property);
    }

    public List<Property> getProperties(){
        return (List<Property>) propertyRepository.findAll();
    }

}
