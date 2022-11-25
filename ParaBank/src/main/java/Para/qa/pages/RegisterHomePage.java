package Para.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Para.qa.Base.TestBase;

public class RegisterHomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement addr;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	WebElement State;
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	WebElement Zipcode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	WebElement Phnumber;
	
	@FindBy(xpath="//input[@id='customer.ssn']")
	WebElement Ssn;
	
	@FindBy(xpath="//input[@id='customer.username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='customer.password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	WebElement repeatpwd;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement reg;
	
	public RegisterHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyFistName(String firstname ) {
		
		FirstName.sendKeys("firstname");
	}
	public void verifyLastName(String lastname) {
		
		lastName.sendKeys("lastname");
	}
	public void verifyStreet(String address) {
		
		addr.sendKeys("address");
	}
	public void verifyCity(String city) {
		City.sendKeys("city");
	}
	public void verifyState(String state) {
		
		State.sendKeys("state");
	}
	public void verifyZip(String zipcode) {
		
		Zipcode.sendKeys("zipcode");
	}
	public void verifyphonenumber(String phonenumber) {
		
		Phnumber.sendKeys("phonenumber");
	}
	public void verifyssn(String ssn) {
		Ssn.sendKeys("ssn");
	}
	public void verifyusername(String username) {
		userName.sendKeys("username");
	}
	public void verifypass(String password) {
		pass.sendKeys("password");
	}
	public void repatpwd(String repearpassword) {
		repeatpwd.sendKeys("repearpassword");
	}
	public void verifyReg() {
		
		reg.sendKeys("register");
	}
}
