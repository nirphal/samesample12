package com.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
		
		
		@FindBy(id="username")
		WebElement Username;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(id="login")
		WebElement Login;
		
		@FindBy(xpath="//a[text()='New User Register Here']")
		WebElement newuser;
		
		@FindBy(xpath="//img[@src=\'img/AdactIn_logo.png\']")
		WebElement imglogo;
		
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
		}
			
		public String validateLoginPageTile() {
			return driver.getTitle();
		}
		
		public Boolean ValidateImg() {
			return imglogo.isDisplayed();
		}
			
		public HomePage loginPage(String un , String pwd) {
			
			Username.sendKeys(un);
			Password.sendKeys(pwd);
			Login.click();
			
			return new HomePage();
		}
			
	}
		
		
		
		
		
	
	

