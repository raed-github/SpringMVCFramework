package com.rsaad.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/*
	 * 
	 * By default, Spring will not aware of the @PostConstruct and @PreDestroy annotation. 
	 * To enable it, you have to either register ‘CommonAnnotationBeanPostProcessor‘ or specify the
	 * ‘<context:annotation-config />‘ in bean configuration file,
	 */
	
	/**
	 * initBean is called after set message property is called
	 * @throws Exception
	 */
	@PostConstruct
	public void initBean() throws Exception{
		System.out.println("Initializing Bean");
	}
	
	/**
	 * clean method is called after context is closed
	 * @throws Exception
	 */
	@PreDestroy
	public void cleanBean() throws Exception{
		System.out.println("Spring container is destroyed! Bean clean up");
	}
	
}
