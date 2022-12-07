package com.example.Executive.service;

import com.example.Executive.model.CustomUserDetails;
import com.example.Executive.model.User;
import com.example.Executive.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found ");
        }

        return new CustomUserDetails(user);
    }

    public User createUserAcc(User user){
        return userRepository.save(user);
    }
}
