package com.rohith_reddy45.springboot_beginner.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohith_reddy45.springboot_beginner.models.User;
import com.rohith_reddy45.springboot_beginner.services.UserService;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User res=userService.getUserById(id);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public User addNewUser(@RequestBody User user){
       return userService.addNewUser(user);
        
    }
}
