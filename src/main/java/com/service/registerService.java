package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.registerDao;
import com.model.Register;


@Service
public class registerService {
	@Autowired
	private registerDao reg;
	
	public int createUser(Register r) {
		return this.reg.saveUser(r);
	}
}
