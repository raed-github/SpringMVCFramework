package com.rsaad.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.helper.OutputHelper;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OutputHelper outputHelper = (OutputHelper)context.getBean("outputHelper");
		outputHelper.generateOutput();
	}
}
