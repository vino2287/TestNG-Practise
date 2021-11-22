package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setup");

	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter URL");
	}
	
	
	@BeforeMethod
	private void login() {
		
		System.out.println("LOGIN");

	}
	
	@Test
	private void searchMobile() {
		System.out.println("SearchMobile");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("SearchLaptop");
	}
	
	
	@AfterMethod
	private void verifyHomePage() {
		System.out.println("VerifyHomePage");
		
	}
	
	@AfterClass
	private void logout() {
		System.out.println("LOGOUT");
	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("CLOSEBROWSER");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("deletecookies");
	}
	
	

	
	
	
	
	
	
	
	
}
