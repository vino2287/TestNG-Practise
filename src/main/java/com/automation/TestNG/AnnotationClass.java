package com.automation.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {
	@BeforeSuite
	public void setup() {
		System.out.println("Environment setup");
	}

	@BeforeTest
	public void browserLaunch() {
		System.out.println("Browser Launch");

	}

	@BeforeClass
	public void enterUrl() {
		System.out.println("Enter Url");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void mobileSearch() {
		System.out.println("Mobile Search");
	}

	@Test
	public void laptopSearch() {
		System.out.println("Laptop Search");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public void verifyHomePage() {
		System.out.println("Verifyhomepage");
	}

	@AfterTest
	public void browserClose() {
		System.out.println("Browser close");
	}

	@AfterSuite
	public void deleteCookies() {
		System.out.println("Delete cookies");
	}
}
