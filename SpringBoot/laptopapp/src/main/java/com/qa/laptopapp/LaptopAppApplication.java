package com.qa.laptopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.laptopapp.interfaces.Laptop;

@SpringBootApplication
public class LaptopAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LaptopAppApplication.class, args);

		Laptop lap1 = context.getBean("Dell", Laptop.class);
		Laptop lap2 = context.getBean("Apple", Laptop.class);

		lap1.spec();
		lap2.spec();
	}
}