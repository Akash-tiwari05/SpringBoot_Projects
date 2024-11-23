package com.akash.SpringProject01;

import com.akash.SpringProject01.Beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProject01Application {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringProject01Application.class, args);
		Car beans = context.getBean(Car.class);
		beans.m1();
	}
}
