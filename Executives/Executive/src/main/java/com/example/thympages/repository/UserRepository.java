package com.example.thympages.repository;

import com.example.thympages.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String userName);
}
