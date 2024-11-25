package com.akash.SpringBoot03;

import com.akash.SpringBoot03.Beans.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot03Application {

	public static void main(String[] args){
		ApplicationContext ctx = SpringApplication.run(SpringBoot03Application.class, args);
		Flipkart bean = ctx.getBean(Flipkart.class);
		bean.paymentGateWay("10000");
	}

}
