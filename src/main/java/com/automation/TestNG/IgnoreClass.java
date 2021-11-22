package com.automation.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreClass {

	@Test(enabled = false)
	public void launchChrome() {
		System.out.println("chrome");
	}

	@Ignore
	@Test
	public void launchIE() {
		System.out.println("Internet Explore");

	}

	@Test
	public void launchFireFox() {
		System.out.println("Firefox");
	}

	@Test
	public void launchSafari() {
		System.out.println("Safari");
	}

}
