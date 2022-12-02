package com.example.Executive.repository;

import com.example.Executive.model.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property,Long> {
}
