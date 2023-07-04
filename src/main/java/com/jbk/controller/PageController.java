package com.jbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	
	@RequestMapping(value ="/")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value ="/addUserPage")
	public String addUserPage() {
		return "add-user";
	}

}
