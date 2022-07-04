package com.anderson.retornalistanomes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anderson.retornalistanomes.models.User;

public interface UserRepository extends MongoRepository<User, String>{

}
