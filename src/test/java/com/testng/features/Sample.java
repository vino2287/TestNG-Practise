package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(retryAnalyzer = MyRetry.class)
	private void userNameValidation() {
		Assert.assertEquals("A", "a");
	}

}
