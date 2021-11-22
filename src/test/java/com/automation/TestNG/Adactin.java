package com.automation.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Adactin {

	public static WebDriver driver;

	@BeforeSuite
	private void set_up() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user pc\\eclipse-workspace\\TestNGPractice\\Driver\\chromedriver.exe");
	}

	@BeforeTest
	private void browser_Launch() {
		driver = new ChromeDriver();
	}

	@BeforeClass
	private void get_Url() {
		driver.get("https://adactinhotelapp.com/");
	}

	@BeforeMethod
	private void login() {
		driver.findElement(By.id("username")).sendKeys("vinovicky");
		driver.findElement(By.id("password")).sendKeys("GMN630");
		driver.findElement(By.id("login")).click();
	}

	@Test
	private void search_hotel() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("London");
		WebElement number_rooms = driver.findElement(By.id("room_nos"));
		Select s1 = new Select(number_rooms);
		s1.selectByVisibleText("2 - Two");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

	}

	@AfterMethod
	private void signout() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterClass
	private void verfiypage() {
		System.out.println("Verify Homepage");
	}

	@AfterTest
	private void browser_close() {
		driver.close();
	}

	@AfterSuite
	private void delete_cookies() {
		driver.manage().deleteAllCookies();
	}
}
