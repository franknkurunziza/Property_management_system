package com.group.Executive.service;

import com.group.Executive.models.User;
import com.group.Executive.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public boolean createUser(User user){
        userRepo.save(user);
        return true;
    }
}
