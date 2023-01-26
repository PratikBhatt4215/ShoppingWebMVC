package com.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.loginDao;

@Repository
public class loginImple  implements loginDao{

	@Autowired
	JdbcTemplate jdbctemplate;
	public boolean validateUser(String email, String password) {
		
		int count=jdbctemplate.queryForObject("select count(*) from usersLogin where email=? and password=?",Integer.class,email,password );
		if(count==1) {
			return true;
		}else {
			
			return false;
		}
		
		
	}
	
	

}
