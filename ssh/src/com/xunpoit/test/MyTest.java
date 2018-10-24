package com.xunpoit.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	//private BookService bookService;
	@Before
	public void before(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//bookService=(BookService) ac.getBean("bookService");
	}
	@Test
	public void run1(){
	//	bookService.addBook(new Book(0,"Java从入门到精通","143234521344",98,1000));
	}
}
