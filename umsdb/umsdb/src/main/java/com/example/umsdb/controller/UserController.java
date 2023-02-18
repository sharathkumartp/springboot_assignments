package com.example.umsdb.controller;


import com.example.umsdb.model.User;
import com.example.umsdb.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ums")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("find-all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("find-by-id/{id}")
    public User findUserById(@PathVariable int id){
        return userService.findById(id);
    }

    @PostMapping("add-user")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<>("User Added" , HttpStatus.OK);
    }

    @PutMapping("update-user-by-id/{userId}")
    public ResponseEntity<String> updateUser(@Valid @PathVariable int userId , @RequestBody User updatedUser){
        userService.updateUser(userId,updatedUser);
        return new ResponseEntity<>("User updated with  id : " + userId , HttpStatus.CREATED);
    }

    @DeleteMapping("delete-user-by-id/id/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User deleted with id :" + userId , HttpStatus.OK);
    }

}
