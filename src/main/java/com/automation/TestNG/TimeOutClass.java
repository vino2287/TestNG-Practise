package com.automation.TestNG;

import org.testng.annotations.Test;

public class TimeOutClass {

	@Test
	public void browserLaunch() {
		System.out.println("chrome");

	}

	@Test
	public void passUrl() {
		System.out.println("https://www.google.com");

	}

	@Test(timeOut = 3000)
	public void searchMoblie() throws InterruptedException {
		System.out.println("Samsung");
		Thread.sleep(2000);

	}

}
