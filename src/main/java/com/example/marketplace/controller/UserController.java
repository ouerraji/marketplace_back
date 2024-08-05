package com.example.marketplace.controller;

import com.example.marketplace.model.entities.User;
import com.example.marketplace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("creatuser")
    public User Createuser(@RequestBody User user){
        return userRepository.save(user);
    }

}
