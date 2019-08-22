package com.masudbappy.foodbooking.controllers;

import com.masudbappy.foodbooking.model.User;
import com.masudbappy.foodbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public ResponseEntity createUser(@RequestBody User user){
        user = this.userService.saveUser(user);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/")
    public String helo(){
        return "hello world";
    }
}
