package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {

Calculator c = new Calculator();

	int sum = 0;
	
	@BeforeEach
	public void testStartup() {
		sum = 0;
		System.out.println("sum is zero. "  + sum);
	}
	
	@Test
	public void testAddTwoNos() {
		int result = c.addNos(100, 200);
		System.out.println("Test case 1");
		Assertions.assertEquals(300, result);
	}
	
	@Test
	public void testSubtractTwoNos() {
		int result = c.subNos(200, 100);
		System.out.println("Test case 2");
		Assertions.assertEquals(100, result, "Please check subtraction method code");
	}
	
	@AfterEach
	public void testSubmit() {
		System.out.println("some object null");
	}
}
