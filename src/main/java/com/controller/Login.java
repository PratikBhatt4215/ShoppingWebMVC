package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	
	@RequestMapping(path = "/login")
	public String homeview() {
		System.out.println("Login page");
		return "login";
	}
}
