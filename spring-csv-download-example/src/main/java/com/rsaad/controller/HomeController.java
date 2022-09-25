package com.rsaad.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rsaad.model.Book;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/viewCSV")
	public ModelAndView viewCSV(HttpServletResponse response) throws IOException {
		
		Book book1 = new Book("Effective Java", "Java Best Practices",
				"Joshua Bloch", "Addision-Wesley", "0321356683", "05/08/2008",
				38);

		Book book2 = new Book("Head First Java", "Java for Beginners",
				"Kathy Sierra & Bert Bates", "O'Reilly Media", "0321356683",
				"02/09/2005", 30);

		Book book3 = new Book("Thinking in Java", "Java Core In-depth",
				"Bruce Eckel", "Prentice Hall", "0131872486", "02/26/2006", 45);

		Book book4 = new Book("Java Generics and Collections",
				"Comprehensive guide to generics and collections",
				"Naftalin & Philip Wadler", "O'Reilly Media", "0596527756",
				"10/24/2006", 27);

		List<Book> listBooks = Arrays.asList(book1, book2, book3, book4);
		
		String[] header = { "Title", "Description", "Author", "Publisher",
				"isbn", "PublishedDate", "Price" };
		
		ModelAndView model = new ModelAndView("ViewCSV");
		model.addObject("csvData", listBooks);
		model.addObject("csvHeader", header);
		
		return model;
	}
}