package com.github.ten_revengineer.muscle.controller;

import com.github.ten_revengineer.muscle.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.github.ten_revengineer.muscle.repository.UserRepository;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 🔹 GET / → 確認用エンドポイント（Whitelabel防止）
    @GetMapping("/")
    public String home() {
        return "Spring Boot アプリは正常に起動しています。";
    }

    // 🔹 GET /users → 全ユーザー取得
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 🔹 POST /users → ユーザー作成
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
