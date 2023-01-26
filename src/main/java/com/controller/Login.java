package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.loginDao;

@Controller
public class Login {
	
	@Autowired
	loginDao loginDao;
	
	@RequestMapping(path = "/login")
	public String homeview() {
		System.out.println("Login page");
		return "login";
	}
	
	@PostMapping("/dologin")
	public String chckUser(@RequestParam("email") String email, @RequestParam("password") String password){
		
		boolean loginFlag=loginDao.validateUser(email, password);
		if(loginFlag==true) {
			return "success";
		}else {
			return "failure";
		}
		
	}
}
