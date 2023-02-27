package com.barclays.practice.basic;

import com.barclays.practice.basic.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BasicApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowiredClass() {
		System.out.println(myController.hello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.hello());
	}

	@Test
	void contextLoads() {
	}

}
