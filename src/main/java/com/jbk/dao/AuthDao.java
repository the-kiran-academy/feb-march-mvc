package com.jbk.dao;

import com.jbk.entity.User;

public interface AuthDao {

	public User  getUser(String username);
}
