package com.automation.TestNG;

import org.testng.annotations.Test;

public class InvocationClass {
	@Test
	public void browserLaunch() {
		System.out.println("Browser Launch");

	}

	@Test
	public void enterUrl() {
		System.out.println("Enter Url");
	}

	@Test
	public void login() {
		System.out.println("Login");
	}

	@Test(invocationCount = 5)
	public void mobileSearch() {
		System.out.println("Mobile Search");
	}

}
