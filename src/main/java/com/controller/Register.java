package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {

	@RequestMapping("/register")
	public String showRegister() {
		System.out.println("Register called");
		return "registeration";
		
	}
}
