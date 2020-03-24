package com.simple;

import org.junit.Assert;
import org.junit.Test;

import com.simple.Greeting;

public class TestGreeting {

	@Test
	public void testLengthOfTheUniqueKey() {

		Greeting msg = new Greeting();
		Assert.assertEquals("GOOD", msg.getStatus());
	}

	@Test
	public void testNotNull() {
		Greeting msg = new Greeting();
		Assert.assertNotNull(msg.getStatus());
	}
	
	@Test
	public void testGetMessage() {
		Greeting greeting = new Greeting();
		
		String message = greeting.getMessage("test");
		
		Assert.assertEquals("Hello, test and welcome!", message);
				
	}
}
