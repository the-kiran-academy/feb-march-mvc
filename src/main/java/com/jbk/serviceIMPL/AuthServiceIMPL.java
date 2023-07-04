package com.jbk.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.AuthDao;
import com.jbk.entity.User;
import com.jbk.service.AuthService;

@Service
public class AuthServiceIMPL implements AuthService {
	
	@Autowired
	private AuthDao authDao;

	@Override
	public User loginProcess(String username, String password) {  //sham ram123
		User user = authDao.getUser(username);
		
		if(user!=null) {
			
			if(password.equals(user.getPassword())) {
				return user;
			}else {
				return null;
			}
			
		}else {
			return null;
		}
		
		
	}

}
