package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LogoutPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	 public LogoutPage() {
		 
		 PageFactory.initElements(driver, this);
		 
	}
	 public String GetTitle() {
		 return driver.getTitle();
	 }
	 public void  Logoutpage() 
	 {
		 logout.click();

	}
	

}
