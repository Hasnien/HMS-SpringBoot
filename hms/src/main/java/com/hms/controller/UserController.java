package com.hms.controller;
import com.hms.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public User saveUser(@RequestBody User user){
        return user;
    }


}
