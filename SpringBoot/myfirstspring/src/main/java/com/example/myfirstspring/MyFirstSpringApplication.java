package com.example.myfirstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.mybeans.Book;
import com.example.mybeans.Person;

//@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MyFirstSpringApplication.class, args);

		ApplicationContext context = SpringApplication.run(AppConfig.class, args);

		// Object byName = context.getBean("greeting");
		// String byType = context.getBean(String.class);
		String beanGreeting = context.getBean("greeting", String.class);
		System.out.println(beanGreeting);

		Person person = context.getBean("getPerson", Person.class);
		System.out.println(person);

		Book book = context.getBean("getBook", Book.class);
		System.out.println(book);
	}

	/*
	@Bean
	public String greeting() {
		return "Hello, world!";
	}
	*/

}
