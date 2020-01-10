package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;

@Controller
public class LoginController {
	ModelAndView modelAndView;
	@RequestMapping("/")
	public ModelAndView login() {
		modelAndView = new ModelAndView("login.jsp");
		User user = new User();
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	@RequestMapping("loginCheck")
	public ModelAndView checkLogin(@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			modelAndView = new ModelAndView("login.jsp");
			return modelAndView;
		}
		modelAndView = new ModelAndView("home.jsp");
		return modelAndView;
	}
}
