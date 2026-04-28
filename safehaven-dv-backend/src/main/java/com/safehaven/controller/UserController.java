package com.safehaven.controller;

import com.safehaven.model.User;
import com.safehaven.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")  // ✅ Allow React to connect
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ REGISTER USER
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // ✅ GET ALL USERS
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // ✅ GET USER BY ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // ✅ DELETE USER
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }

    // ✅ LOGIN API
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User loggedInUser = userService.login(user.getEmail(), user.getPassword());

        if (loggedInUser != null) {
            return loggedInUser;
        } else {
            return null; // ❗ Later improve with proper response
        }
    }
}