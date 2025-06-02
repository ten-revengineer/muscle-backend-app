package com.example.springboot_hello.controller;
import com.example.springboot_hello.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.springboot_hello.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
