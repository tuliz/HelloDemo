package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.User;

public class LoginService{
@Autowired
private LoginRepository repo;

public boolean checkUser(User user) {
	List<User> userList = (List<User>) repo.findAll();
	for(int i = 0; i < userList.size(); i++) {
		if(user.getUserName().equals(userList.get(i).getUserName()) && user.getPassword().equals(userList.get(i).getPassword()))
			return true;
	}
	return false;
}
}
