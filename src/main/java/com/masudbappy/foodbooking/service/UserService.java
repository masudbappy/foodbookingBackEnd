package com.masudbappy.foodbooking.service;

import com.masudbappy.foodbooking.model.User;
import com.masudbappy.foodbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        if (user == null) throw new IllegalArgumentException("User can not be null");
        return userRepository.save(user);
    }
}
