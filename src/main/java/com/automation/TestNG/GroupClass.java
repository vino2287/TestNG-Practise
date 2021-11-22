package com.automation.TestNG;

import org.testng.annotations.Test;

public class GroupClass {

	@Test(groups = "Employee Details")
	public void empName() {
		System.out.println("Empoyee name is Vinoth");

	}

	@Test(groups = "Employee Details")
	public void empID() {
		System.out.println("Employee id is 534543");

	}

	@Test(groups = "Student Details")
	public void studentName() {
		System.out.println("Student name is Vicky");

	}

	@Test(groups = "Student Details")
	public void studentID() {
		System.out.println("Student id is 1589");

	}

}
