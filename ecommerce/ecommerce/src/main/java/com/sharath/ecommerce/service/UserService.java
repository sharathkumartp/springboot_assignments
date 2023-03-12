package com.sharath.ecommerce.service;

import com.sharath.ecommerce.dao.UserRepo;
import com.sharath.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public String saveUser(User user) {
        userRepo.save(user);
        return "save user";
    }

    public User getUserById(Integer userId) {
        return userRepo.getById(userId);
    }
}
