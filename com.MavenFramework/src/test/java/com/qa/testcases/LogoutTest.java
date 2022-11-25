package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;

public class LogoutTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	LogoutPage logoutpage;
	
	public LogoutTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 loginpage=new LoginPage ();
		loginpage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
	//	 homepage=new HomePage();
		 logoutpage =new LogoutPage();
	   

	}
	@Test
    public void GetTitle() {
		
		String title=logoutpage.GetTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Adactin.com - Search Hotel");
	}
	
	@Test
	public void Logout() {
		
		logoutpage.Logoutpage();
	}
	
	
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
