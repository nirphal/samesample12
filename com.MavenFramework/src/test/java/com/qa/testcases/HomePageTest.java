package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginPage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage =new LoginPage();
	loginPage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		homepage=new HomePage();
	}
	
	@Test
	public void WelcomeText() {

		
		boolean text=homepage.Welcometext();
		Assert.assertTrue(text);
	}
	
	@Test
	public void LocationDropdown() {
		
		homepage.Locationdropdown();
		
	}
	@Test
	public void getText() {
		
		String title=homepage.homepagetitle();
		Assert.assertEquals(title,"Adactin.com - Search Hotel");
	}
	@AfterMethod
	public void teardown()	{
		
		driver.quit();
		
	}
	

}
