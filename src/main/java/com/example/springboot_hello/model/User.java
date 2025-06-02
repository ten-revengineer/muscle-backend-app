package com.example.springboot_hello.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;  // ← 追加

    // デフォルトコンストラクタ（必須）
    public User() {}

    // 便利なコンストラクタ（オプション）
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // ゲッター・セッター
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }       // ← 追加
    public void setEmail(String email) { this.email = email; }  // ← 追加
}
