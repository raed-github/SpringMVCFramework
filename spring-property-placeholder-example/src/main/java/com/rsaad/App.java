package com.rsaad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.custom.CustomDataSource;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = 
		    	new ClassPathXmlApplicationContext(new String[] {
		              "database/Spring-Datasource.xml"});	
		
		CustomDataSource customDataSource = (CustomDataSource) context.getBean("dataSource");

		System.out.println(customDataSource.getUrl());
		System.out.println(customDataSource.getDriverClassName());
		System.out.println(customDataSource.getUsername());
		System.out.println(customDataSource.getPassword());
    	
    }
}
