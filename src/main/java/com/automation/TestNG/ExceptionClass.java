package com.automation.TestNG;

import org.testng.annotations.Test;

public class ExceptionClass {
	@Test(expectedExceptions = ArithmeticException.class)
	public void calc() {
		System.out.println(10 / 0);

	}

}
