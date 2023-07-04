package com.jbk.service;

import com.jbk.entity.User;

public interface AuthService {
	
	public User  loginProcess(String username,String password);

}
