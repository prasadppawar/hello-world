package com.developer.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.developer.model.FlightDeparture;

@ContextConfiguration("classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BagPathFinderTest {

	@Autowired
	private FlightDeparture finder;

	@Test
	public void testExecute() {

		System.out.println("");
	}

}
