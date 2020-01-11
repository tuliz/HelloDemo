package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.entity.User;
import com.example.services.LoginService;

@Controller
public class LoginController {
@Autowired
private LoginService service;
private ModelAndView modelAndView;
@RequestMapping("/")
public ModelAndView view() {
	modelAndView = new ModelAndView("login.jsp");
	User user = new User();
	modelAndView.addObject("user", user);
	return modelAndView;
}
@RequestMapping(method =RequestMethod.POST, value = "loginCheck")
public ModelAndView login(User user) {
	modelAndView = new ModelAndView("login.jsp");
	if(service.checkUser(user)) {
	modelAndView = new ModelAndView("home.jsp");
	modelAndView.addObject("user", user);
	return modelAndView;
	}
	modelAndView.addObject("user", user);
	return modelAndView;	
}
}
