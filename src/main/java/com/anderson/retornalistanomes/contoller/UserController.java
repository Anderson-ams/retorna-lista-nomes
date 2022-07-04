package com.anderson.retornalistanomes.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.retornalistanomes.models.User;
import com.anderson.retornalistanomes.repositories.UserRepository;

@RestController
public class UserController {

	private final UserRepository userRepository;
	
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/")
	public List<User> getUser(){
		return userRepository.findAll();
		
	}
}
