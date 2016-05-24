package com.developer.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class
 *
 */
public class PathFinderMain {

	/**
	 * This is the Pathfinder main function
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.close();
	}

}
