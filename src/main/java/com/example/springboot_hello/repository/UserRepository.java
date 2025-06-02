package com.example.springboot_hello.repository;

import com.example.springboot_hello.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // ここにカスタムメソッドを追加できます
}


