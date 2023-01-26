package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.Register;

public class registerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(Register r) {
		int id = (Integer) this.hibernateTemplate.save(r);
		return id;
	}

}
