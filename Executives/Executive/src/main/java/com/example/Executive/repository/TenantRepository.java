package com.example.Executive.repository;

import com.example.Executive.model.Tenant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends CrudRepository<Tenant,Long> {
}
