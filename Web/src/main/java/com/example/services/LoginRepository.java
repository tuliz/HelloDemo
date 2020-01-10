package com.example.services;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.User;

public interface LoginRepository extends CrudRepository<User, Integer>{

}
