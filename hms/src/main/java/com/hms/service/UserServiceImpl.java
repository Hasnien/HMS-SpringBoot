package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> fatchUserList() {
        return userRepo.findAll();
    }

    @Override
    public User fatchUserById(int userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public User deleteUser(int userId) {
       return userRepo.deleteById(userId);
    }

    @Override
    public User updateUser(int userId) {
        return null;
    }

    @Override
    public User updateUser(int userId, User user) {
        User userUpdate = userRepo.findById(userId).get();
        if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())){
            userUpdate.setUsername(user.getUsername());
        }
        if (Objects.nonNull(user.getAge()) && !"".equalsIgnoreCase(String.valueOf(user.getAge()))){
            userUpdate.setUsername(user.getUsername());
        }
        return userRepo.save(userUpdate);

    }


}
