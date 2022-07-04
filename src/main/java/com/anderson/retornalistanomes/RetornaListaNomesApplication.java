package com.anderson.retornalistanomes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anderson.retornalistanomes.models.User;
import com.anderson.retornalistanomes.repositories.UserRepository;

@SpringBootApplication
public class RetornaListaNomesApplication implements CommandLineRunner {

	private final UserRepository userRepository;
	
	public RetornaListaNomesApplication (UserRepository userRepository){
		this.userRepository = userRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(RetornaListaNomesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		if(userRepository.findAll().isEmpty()) {
			
			userRepository.save(new User("Nome", "SegundoNome"));
			userRepository.save(new User("Nome1", "SegundoNome1"));
			userRepository.save(new User("Nome2", "SegundoNome2"));
		}
		for(User user : userRepository.findAll()) {
			System.out.println(user);
		}
	}

}
