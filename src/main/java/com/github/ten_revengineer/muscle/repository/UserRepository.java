package com.github.ten_revengineer.muscle.repository;

import com.github.ten_revengineer.muscle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // ここにカスタムメソッドを追加できます
}


