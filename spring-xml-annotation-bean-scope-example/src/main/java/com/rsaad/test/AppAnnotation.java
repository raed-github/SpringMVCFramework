package com.rsaad.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.service.UserService;

public class AppAnnotation {
	public static void main(String[] args) {
		ApplicationContext annotaionContext = new ClassPathXmlApplicationContext(new String[] { "Spring-AnnotationBeanScope-Bean.xml" });
		
		UserService userA = (UserService) annotaionContext.getBean("userService");
		userA.setMessage("Message by userA");
		System.out.println("Message : " + userA.getMessage());

		// retrieve it again
		UserService userB = (UserService) annotaionContext.getBean("userService");
		System.out.println("Message : " + userB.getMessage());
	}
}
