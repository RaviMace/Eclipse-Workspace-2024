package com.actitime.testscriptslibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String eTitle = "Soogle";
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
	}
}
