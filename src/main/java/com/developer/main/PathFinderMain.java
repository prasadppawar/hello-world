package com.developer.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PathFinderMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.close();
	}

}
