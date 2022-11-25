package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	WebElement welcometext;
	
	@FindBy(xpath="//select[@id='location']")
	WebElement location;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String homepagetitle() {
		
		return driver.getTitle();
	}
	
	public boolean Welcometext() {
		
		return welcometext.isDisplayed();
		
	}
	
	public LogoutPage Locationdropdown() {
		
		Select s=new Select(location);
		
		s.selectByVisibleText("Paris");
		
		return new LogoutPage();
		
	}

}
