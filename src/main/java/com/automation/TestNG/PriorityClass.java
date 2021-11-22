package com.automation.TestNG;

import org.testng.annotations.Test;

public class PriorityClass {

	@Test(priority=2)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority=2)
	public void mobileSearch() {
		System.out.println("Mobile Search");
	}

	@Test(priority=1)
	public void laptopSearch() {
		System.out.println("Laptop Search");
	}

	@Test(priority=-1)
	public void logout() {
		System.out.println("Logout");
	}

}
