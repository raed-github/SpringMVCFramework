package com.rsaad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsaad.dao.UserDAO;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public String toString() {
		return "UserService [userDAO=" + userDAO + "]";
	}
}
