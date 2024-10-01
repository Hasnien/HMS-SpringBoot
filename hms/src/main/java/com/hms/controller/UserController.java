package com.hms.controller;
import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);

    }
    @GetMapping(path = "/users")
    public List<User> fatchUserlist(){
        return userService.fatchUserList();
    }
    @GetMapping(path = "/users/{id}")
    public User fatchUser(@PathVariable("id") int userId){
        return userService.fatchUserById(userId);
    }
    @DeleteMapping(path = "/user/{id}")
    public User deleteUser(@PathVariable("id") int userId){
        return userService.deleteUser(userId);
    }
    @PutMapping(path="/user/{id}")
    public @ResponseBody User updateUser(@PathVariable("id") int userId,@RequestBody User user){
        return userService.updateUser(userId);
    }

}
