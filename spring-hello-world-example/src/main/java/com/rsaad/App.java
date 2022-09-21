package com.rsaad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 	ApplicationContext ctx =  new ClassPathXmlApplicationContext("SpringBeans.xml");
		 	HelloWorld obj = (HelloWorld) ctx.getBean("helloBean");
		 	obj.printHello();		 	
	}
}
