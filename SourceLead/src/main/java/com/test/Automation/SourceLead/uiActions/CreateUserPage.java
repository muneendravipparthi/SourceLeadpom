package com.test.Automation.SourceLead.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage {
	WebDriver driver;
	
	@FindBy(id="EmployeeId")
	WebElement employeeid;
	
	@FindBy(id="DateofJoin")
	WebElement dateOfJoin;
	
	@FindBy(id="EmailId")
	WebElement emailId;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(xpath="html/body/div[1]/section/div/div[2]/form/div[1]/div/div[7]/div/input[1]")
	WebElement phonenumber;
	
	@FindBy(xpath="//*[@id='department_chosen']/a/span")
	WebElement department;
	
	@FindBy(xpath="//*[@id='createUser_form']/div[1]/div/div[9]/div/div/button")
	WebElement employeetype;
	
	@FindBy(xpath="//*[@id='role_chosen']/a/span")
	WebElement role;
	
	
	@FindBy(xpath="//*[@id='reportingManager_chosen']/a/span")
	WebElement manager;
	
	@FindBy(xpath="//*[@id='createUser_form']/div[1]/div/div[13]/div/div/div[1]/div/button")
	WebElement ratetype;
	
	@FindBy(id="Rate")
	WebElement rate;
	
	@FindBy(xpath="//*[@id='createUser_form']/div[1]/div/div[13]/div/div/div[2]/div/button")
	WebElement rateper;
	
	@FindBy(id="DayHours")
	WebElement dayhours;
	
	@FindBy(id="create_user")
	WebElement save;
	
	public CreateUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createUser(String empId, String email, String FName,String LName, String number ) {
		employeeid.sendKeys(empId);
		emailId.sendKeys(email);
		firstname.sendKeys(FName);
		lastname.sendKeys(LName);
		phonenumber.sendKeys(number);
		save.click();
	}
}
