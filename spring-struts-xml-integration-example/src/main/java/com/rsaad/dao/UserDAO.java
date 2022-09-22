package com.rsaad.dao;

import com.rsaad.model.User;

public class UserDAO {
	public boolean checkLogin(User user) {
		return user.getUsername().equals("admin")
				&& user.getPassword().equals("admin");
	}
}
