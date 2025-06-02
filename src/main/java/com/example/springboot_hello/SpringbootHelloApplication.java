package com.example.springboot_hello;

import com.example.springboot_hello.model.User;
import com.example.springboot_hello.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository){
		return (args) -> {
			userRepository.save(new User("Taro", "taro@example.com"));
			userRepository.save(new User("Jiro", "jiro@example.com"));

		};
	}

}

