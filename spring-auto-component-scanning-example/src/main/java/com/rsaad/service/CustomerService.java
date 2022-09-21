package com.rsaad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rsaad.dao.CustomerDAO;

@Component
public class CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
}
