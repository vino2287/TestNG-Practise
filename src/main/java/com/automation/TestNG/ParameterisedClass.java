package com.automation.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedClass {
	@Test
	@Parameters({"username","password"})
	public void login(String username, String  password) {
		System.out.println("userName is : "+username+"   password is : "+ password);

	}

}
