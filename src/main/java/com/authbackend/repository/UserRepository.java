package com.authbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.authbackend.model.User;



public interface UserRepository extends MongoRepository<User, String>{
	User findByEmail(String email);
}
