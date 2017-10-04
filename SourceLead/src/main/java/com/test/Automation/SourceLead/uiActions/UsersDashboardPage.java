package com.test.Automation.SourceLead.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersDashboardPage {
	WebDriver driver;

	@FindBy(xpath= "html/body/div[1]/section/div/section[2]/div[2]/div/ul/li[5]/a")
	WebElement AddUser;
	
	public UsersDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addUser() throws InterruptedException {
		Thread.sleep(30000);
		this.AddUser.click();
	}
}
