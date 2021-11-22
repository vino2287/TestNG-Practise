package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	String actual = "Bala";
	String expected = "bala";
	
	//Hard Assert---> validation
	
	@Test
	private void test1() {
		System.out.println("Test Started");
		Assert.assertEquals(actual, expected);//When assertion fails it will terminate the execution
		System.out.println("Test Completed");
	}
	
	//softAssert --->verification
	@Test
	private void test2() {
		SoftAssert sa = new SoftAssert();// even though  the assertion fails it will continue the execution
		System.out.println("Test Started");
		sa.assertEquals(actual, expected);
		System.out.println("Test Completed");
		sa.assertAll();// it is given to check whether the  method is passed or failed.
		

	}
	
	
	
	
	
	

}
