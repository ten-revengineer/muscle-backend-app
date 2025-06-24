package com.github.ten_revengineer.muscle;

import com.github.ten_revengineer.muscle.model.User;
import com.github.ten_revengineer.muscle.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MuscleBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuscleBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository){
		return (args) -> {
			userRepository.save(new User("Taro", "taro@example.com"));
			userRepository.save(new User("Jiro", "jiro@example.com"));

		};
	}

}

