package Para.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Para.qa.Base.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement reg;
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Registerpage() {
		 reg.click();
	}

}
