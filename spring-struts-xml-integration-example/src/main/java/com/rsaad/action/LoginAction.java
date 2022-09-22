package com.rsaad.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rsaad.dao.UserDAO;
import com.rsaad.model.User;

public class LoginAction extends ActionSupport {
	private UserDAO userDAO;
	private User user;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}

	public String execute(){
		if (userDAO.checkLogin(user)) {
			return SUCCESS;
		}
		
		return ERROR;
	}
}
