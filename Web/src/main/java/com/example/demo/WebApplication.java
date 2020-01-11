package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.entity.User;
import com.example.services.LoginRepository;
import com.example.services.LoginService;


@SpringBootApplication
public class WebApplication {

	@Bean(name = "LoginService")
	public LoginService service() {
		return new LoginService();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
