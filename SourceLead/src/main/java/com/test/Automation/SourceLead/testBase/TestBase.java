package com.test.Automation.SourceLead.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	String url = "http://qa2.sourcelead.net/sourcelead/login";
	String browser ="firefox";
	
	public void init() {
		selectBrowser(browser);
		getUrl(url);
	}
	
	
	public void selectBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	public void getUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
