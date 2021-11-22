package com.automation.TestNG;

import org.testng.annotations.Test;

public class FailedTestCaseClass {
	@Test
	public void test1() {
		System.out.println(10 / 2);
	}

	@Test
	public void test2() {
		System.out.println(10 / 10);
	}

	@Test
	public void test3() {
		System.out.println(10 / 0);
	}

}
