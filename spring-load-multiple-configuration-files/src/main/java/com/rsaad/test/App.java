package com.rsaad.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsaad.helper.CsvHelper;
import com.rsaad.helper.ExcelHelper;
import com.rsaad.helper.Helper;
import com.rsaad.helper.JsonHelper;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext contextWithoutImport = 
		    	new ClassPathXmlApplicationContext(new String[] {"common/Spring-Common.xml",
		              "connection/Spring-Connection.xml","moduleA/Spring-ModuleA.xml"});

		Helper csvHelper1 = (CsvHelper)contextWithoutImport.getBean("csvHelper");
		csvHelper1.generateOutput();
		
		ExcelHelper excelHelper1 = (ExcelHelper)contextWithoutImport.getBean("excelHelper");
		excelHelper1.generateOutput();
		
		JsonHelper jsonHelper1 = (JsonHelper)contextWithoutImport.getBean("jsonHelper");
		jsonHelper1.generateOutput();

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("------------------------ Context using import ---------------------------");
		System.out.println("-------------------------------------------------------------------------------------");
	
		
		ApplicationContext contextWithImport = new ClassPathXmlApplicationContext("Spring-All-Module.xml");
		Helper csvHelper = (CsvHelper)contextWithImport.getBean("csvHelper");
		csvHelper.generateOutput();
		
		ExcelHelper excelHelper = (ExcelHelper)contextWithImport.getBean("excelHelper");
		excelHelper.generateOutput();
		
		JsonHelper jsonHelper = (JsonHelper)contextWithImport.getBean("jsonHelper");
		jsonHelper.generateOutput();
	}
}
