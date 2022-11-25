package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		loginPage =new LoginPage();
	}
	
	@Test(priority=3)
	public void LoginPageTitle() {
		String title=loginPage.validateLoginPageTile();
		Assert.assertEquals(title, "Adactin.com - Hotel Reservation System");
	}
	
	@Test(priority=1)
	public void ImgLogo() {
		Boolean flag=loginPage.ValidateImg();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void LoginPage() {
		
		homepage=loginPage.loginPage(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	
	

}
