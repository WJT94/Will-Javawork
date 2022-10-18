package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.interfaces.Car;

/*
 * For Components:
 * 1.  Create interfaces package
 *       Create car interface
 * 2.  Create cars package
 *       Create Audi, BMW, and Engine
 * 3.  Modify main program
 * 4.  Check on annotations
 * Next steps performed:
 * 5.  Change Engine to an interface and move it into the interfaces package
 *       Change spec attribute to an abstract method
 * 6.  Create an engines package
 * 7.  Create two classes (V8 and V6) implementing Engine
 * 8.  Add component with names (V6/V8) on their respective classes
 * 9.  Add @Qualifier to Engine in Audi and BMW
 */

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DependencyInjectionApplication.class, args);
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		Car car1 = context.getBean("Audi", Car.class);
		Car car2 = context.getBean("BMW", Car.class);

		car1.spec();
		car2.spec();
	}

}
