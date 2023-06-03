package com.hoaxify.hoaxify.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
    @Autowired

    UserService userService;
    @PostMapping("/api/1.0/users")
    void createUser(@RequestBody User user){
    userService.save(user);
    }

}
