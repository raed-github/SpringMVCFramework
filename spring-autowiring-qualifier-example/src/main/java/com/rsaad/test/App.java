package com.rsaad.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.Customer;


public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
		Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust);
		context.close();
	}

}
