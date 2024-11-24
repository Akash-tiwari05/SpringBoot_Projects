package com.aryan.SpringBootp02;

import com.aryan.SpringBootp02.beans.Instagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootp02Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringBootp02Application.class, args);
		Instagram bean =ctx.getBean(Instagram.class);
		bean.play();
	}
}
