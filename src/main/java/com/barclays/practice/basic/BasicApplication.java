package com.barclays.practice.basic;

import com.barclays.practice.basic.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BasicApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("in main");
		System.out.println(controller.hello());
	}

}
