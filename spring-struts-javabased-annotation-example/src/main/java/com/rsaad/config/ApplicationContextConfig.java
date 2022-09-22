package com.rsaad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rsaad.dao.UserDAO;


@Configuration
@ComponentScan("com.rsaad")
public class ApplicationContextConfig {
	
	@Bean(name = "userDAO")
	public UserDAO getUserDAO() {
		return new UserDAO();
	}	
}