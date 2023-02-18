package com.example.umsdb.service;


import com.example.umsdb.model.User;
import com.example.umsdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(int id){
        return userRepository.findById(id).get();
    }

    public void addUser(User newUser){
        userRepository.save(newUser);
    }

    public void updateUser(int id , User newUser){
        User user = userRepository.findById(id).get();
        user.setUserName(newUser.getUserName());
        user.setEmail(newUser.getEmail());
        user.setDateOfBirth(newUser.getDateOfBirth());
        user.setDateTime(newUser.getDateTime());
        user.setPhoneNumber(newUser.getPhoneNumber());
        userRepository.save(user);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
}
