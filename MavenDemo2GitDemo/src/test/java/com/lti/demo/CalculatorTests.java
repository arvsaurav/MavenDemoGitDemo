package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {

	Calculator c = new Calculator();
	
	@Disabled
	@Test
	public void testSayHello() {
							// (expected, actual)
		String msg = c.sayHello();
		Assertions.assertEquals(msg, c.sayHello());
	}
	
	@Disabled
	@Test
	public void testAddTwoNos() {
		int result = c.addNos(100, 200);
		
		Assertions.assertEquals(300, result);
	}
	
	@Disabled
	@Test
	public void testSubtractTwoNos() {
		int result = c.subNos(200, 100);
		
		Assertions.assertEquals(100, result, "Please check subtraction method code");
	}
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		
		Assertions.assertEquals(3, myList.size());
		
	}
	
	
}
