package com.rsaad.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.service.CustomerService;

public class AppXml {
	public static void main(String[] args) {
		ApplicationContext singletonContext = new ClassPathXmlApplicationContext(new String[] { "Spring-Singleton-Bean.xml" });

		CustomerService custA = (CustomerService) singletonContext.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		CustomerService custB = (CustomerService) singletonContext.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("------------------------ Prototype context example ---------------------------");
		System.out.println("-------------------------------------------------------------------------------------");

		ApplicationContext protoTypeContext = new ClassPathXmlApplicationContext(new String[] { "Spring-Prototype-Bean.xml" });

		CustomerService custC = (CustomerService) protoTypeContext.getBean("customerService");
		custC.setMessage("Message by custC");
		System.out.println("Message : " + custC.getMessage());

		// retrieve it again
		CustomerService custD = (CustomerService) protoTypeContext.getBean("customerService");
		System.out.println("Message : " + custD.getMessage());

	}

}
