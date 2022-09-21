package com.rsaad.service;

public class CustomerService {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * initBean is called after set message property is called
	 * @throws Exception
	 */
	public void initBean() throws Exception{
		System.out.println("Initializing Bean");
	}
	
	/**
	 * clean method is called after context is closed
	 * @throws Exception
	 */
	public void cleanBean() throws Exception{
		System.out.println("Spring container is destroyed! Bean clean up");
	}
}
