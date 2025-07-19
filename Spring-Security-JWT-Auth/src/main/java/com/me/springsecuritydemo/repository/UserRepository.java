package com.me.springsecuritydemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.springsecuritydemo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
