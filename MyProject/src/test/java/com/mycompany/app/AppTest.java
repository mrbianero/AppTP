package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSum() {
		double a = 5, b = 7, c = a+b, d=a-b;
		assertEquals(c, Calculator.sum(a, b), (double)0.0001);
	}

	@Test
	public void testSub() {
		double a = 5, b = 7, c = a-b;
		assertEquals(c, Calculator.sub(a, b), (double)0.0001);
	}
	@Test
	public void testStart() {
		String s ="abc";
		assertEquals("ABC", UpperCase.start(s));
	}

}
