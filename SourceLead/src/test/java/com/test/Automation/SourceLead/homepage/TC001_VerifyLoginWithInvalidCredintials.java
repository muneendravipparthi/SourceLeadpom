package com.test.Automation.SourceLead.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.Automation.SourceLead.testBase.TestBase;
import com.test.Automation.SourceLead.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredintials extends TestBase {
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyLoginWithInvalidCredintials() {
		homepage = new HomePage(driver);
		homepage.loginToApplication("munna@gmail.com", "Pwd123");
		Assert.assertEquals(homepage.getInvalidloginText(), "You are not registered user. Please get register.");
	}
	
	@AfterClass
	public void endTest() {
		driver.close();
	}
}
