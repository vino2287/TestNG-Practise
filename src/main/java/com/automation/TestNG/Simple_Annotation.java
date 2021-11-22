package com.automation.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.baseclass.org.BaseClass;

public class Simple_Annotation extends BaseClass {

	public static WebDriver driver;

	@BeforeSuite
	private void browser_setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\TestNGPractice\\Driver\\chromedriver.exe");
	}

	@BeforeTest
	private void browser_launch() {
		driver = new ChromeDriver();
	}

	@BeforeClass
	private void url() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	private void login() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("vinovicky");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("GMN630");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Test
	private void search_Hotel() {
		selection(driver.findElement(By.id("location")), "byVisibleText", "Paris");
		selection(driver.findElement(By.id("room_nos")), "byValue", "2");
		selection(driver.findElement(By.id("adult_room")), "byValue", "2");
		clickOnElement(driver.findElement(By.id("Submit")));
	}

	@AfterMethod
	private void logout() {
		clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
	}

	@AfterClass
	private void verify_Homepage() {
		System.out.println("Verified Home Page");
	}

	@AfterTest
	private void browser_Close() {
		driver.close();
	}

	@AfterSuite
	private void delete_Cookies() {
		driver.manage().deleteAllCookies();
	}
}
