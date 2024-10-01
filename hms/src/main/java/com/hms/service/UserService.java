package com.hms.service;

import com.hms.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> fatchUserList();

    public User fatchUserById(int userId);

    public User deleteUser(int userId);


    public User updateUser(int userId);

    User updateUser(int userId, User user);
}

