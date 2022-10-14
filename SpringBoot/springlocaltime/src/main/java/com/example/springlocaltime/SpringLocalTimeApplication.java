package com.example.springlocaltime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

@SpringBootApplication
public class SpringLocalTimeApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringLocalTimeApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringLocalTimeApplication.class, args);

		Object byName = context.getBean("currentTime");
		LocalTime byType = context.getBean(LocalTime.class);
		LocalTime byBoth = context.getBean("currentTime", LocalTime.class);

		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
	}

	@Bean
	public LocalTime currentTime() {
		return LocalTime.now();
	}
}
