package com.test.Automation.SourceLead.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;

	@FindBy(xpath="html/body/div[1]/aside/div/div/div/ul/li[3]/a")
	WebElement  Users;
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usersDashboard() {
		this.Users.click();
		
	}

}
