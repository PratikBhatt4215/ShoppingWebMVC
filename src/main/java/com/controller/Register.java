package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.registerService;

@Controller
public class Register {
	@Autowired
	private registerService reg;
	
	
	@RequestMapping("/register")
	public String showRegister() {
		System.out.println("Register called");
		return "registeration";
		
	}
	
	@RequestMapping(path = "/doregister",method = RequestMethod.POST)
	public String userRegister(@ModelAttribute("register") Register register, Model m) {
		int createdUser = this.reg.createUser(register);
		model.addAttribute("msg", "User created with id " + createdUser);
		return "success";
		
	}
	
	
}
