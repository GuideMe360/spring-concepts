package com.tpg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
		hw.getMessage();
	}

}
