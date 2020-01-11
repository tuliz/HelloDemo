package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.DAO.LoginDAO;
import com.example.entity.User;

public class LoginService{
	public void postUser(User user) {
		 new LoginDAO().postUser(user);
	
	}
	
public boolean checkUser(User user) {
	return new LoginDAO().checkUser(user);
}
}
