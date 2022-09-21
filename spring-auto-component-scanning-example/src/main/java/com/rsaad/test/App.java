package com.rsaad.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.service.CustomerService;
import com.rsaad.service.UserService;

/**
 * Now, enable Spring auto component scanning features.

	Annotate with @Component to indicate this is class is an auto scan component.
	
	Put this “context:component” in bean configuration file, it means, enable auto scanning feature in Spring.
	The base-package is indicate where are your components stored, Spring will scan this folder and find out the
	bean (annotated with @Component) and register it in Spring container.
 
 * @author Raed
 *
 */
public class App {
	public static void main(String[] args) {
    	ApplicationContext context = 
    	    	   new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});

    	    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	    	System.out.println(cust);
    	    	System.out.println("----------------------------------------------------------");
    	    	UserService userService = (UserService)context.getBean("userService");
    	    	System.out.println(userService);

	}
}
