package com.automation.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@Test(dataProvider = "dataBase")
	public void credential(String username, String password) {
		System.out.println("Username is:" + username + "password is:" + password);

	}

	@DataProvider(name = "dataBase")
	public Object[][] dataBase() {
		return new Object[][] {
			{ "111", "aaa" }, 
			{ "222", "bbb" }, 
			{ "333", "ccc" }

		};
	}
}
