package com.git_tutorial.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void verifyTitle()
	{
		String actual_title = driver.getTitle();
		
		Assert.assertEquals(actual_title, "Facebook - log in or sign up");
	}
}
