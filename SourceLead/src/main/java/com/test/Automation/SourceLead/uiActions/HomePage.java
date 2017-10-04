package com.test.Automation.SourceLead.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='signin']/form/span[1]/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id='signin']/form/span[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='signin']/form/input[6]")
	WebElement submit;
	
	@FindBy(xpath="//*[@id='signin']/div/font")
	WebElement loginfaildauthentication;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void loginToApplication(String user, String pwd) {
	username.sendKeys(user);
	password.sendKeys(pwd);
	submit.click();
}
public String getInvalidloginText() {
	return loginfaildauthentication.getText();
	
}
}