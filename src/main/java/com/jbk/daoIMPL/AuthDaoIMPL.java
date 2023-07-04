package com.jbk.daoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dao.AuthDao;
import com.jbk.entity.User;

@Repository
public class AuthDaoIMPL implements AuthDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public User getUser(String username) {
		
		Session session = factory.openSession();
		
		User user = session.get(User.class, username);
		return user;
	}

}
