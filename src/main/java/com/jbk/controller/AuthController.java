package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jbk.entity.User;
import com.jbk.service.AuthService;

@Controller
public class AuthController {
	
	@Autowired
	private AuthService authService;

	@PostMapping(value = "/login")
	public String loginProcess(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
		
		User user = authService.loginProcess(username, password);
		
		if(user!=null) {
			return "home";
		}else {
			model.addAttribute("msg", "Invalid Credientials !!");
			return "login";
		}
		
		
		
	}
	
}
