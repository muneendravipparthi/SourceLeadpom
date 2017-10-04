package com.test.Automation.SourceLead.homepage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.Automation.SourceLead.testBase.TestBase;
import com.test.Automation.SourceLead.uiActions.CreateUserPage;
import com.test.Automation.SourceLead.uiActions.DashboardPage;
import com.test.Automation.SourceLead.uiActions.HomePage;
import com.test.Automation.SourceLead.uiActions.UsersDashboardPage;

public class TC002_VerifyLoginWithValidCredintials extends TestBase {
HomePage homepage;
DashboardPage dashboardpage;
UsersDashboardPage userdashboardpage;
CreateUserPage createuserpage;
	@BeforeTest
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyLoginWithInvalidCredintials() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.loginToApplication("emp1.qa@gmail.com", "Pwd123");
		dashboardpage = new DashboardPage(driver);
		dashboardpage.usersDashboard();
		userdashboardpage = new UsersDashboardPage(driver);
		userdashboardpage.addUser();
		createuserpage = new CreateUserPage(driver);
		createuserpage.createUser("emp123", "email123@gmail.com", "test one", "test two", "9878894585");
	}
	
	@AfterClass
	public void endTest() {
		driver.close();
	}
}
