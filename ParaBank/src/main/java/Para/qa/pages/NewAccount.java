package Para.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Para.qa.Base.TestBase;

public class NewAccount extends TestBase{
	
	@FindBy(xpath="//td[text()='Account Number:']")
	WebElement accNum;
	
	@FindBy(xpath="//td[text()='15453']")
	WebElement number;
	
	@FindBy(xpath="//td[text()='Account Type:']")
	WebElement accType;
	
	@FindBy(xpath="/td[text()='CHECKING']")
	WebElement checking;
	
	@FindBy(xpath="//td[text()='Balance:']")
	WebElement balance;
	
	@FindBy(xpath="(//td[text()='$100.00'])[1]")
	WebElement dollernumb;
	
	@FindBy(xpath="//td[text()='Available:']")
	WebElement avaliable;
	
	@FindBy(xpath="(//td[text()='$100.00'])[2]")
	WebElement dollernumb1;
	
	public NewAccount() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAccountNumberName() {
		
		String accname=accNum.getText();
		Assert.assertEquals(accname,"Account Number:"	);
		
	}
	
	public void VerifyAccNumber() {
		
		Boolean accno=number.isDisplayed();
		Assert.assertTrue(true);
		
	}
	
	public void VerifyAccountType() {
		
		Boolean actype=accType.isDisplayed();
		Assert.assertTrue(true);
	}
	
	public void VerifyChecking() {
		
		Boolean chk=checking.isDisplayed();
		Assert.assertTrue(true);
	}
	
	public void VerifyBalance() {
		
		balance.isDisplayed();
	
	}
	
	public void VerifyDollernum() {
		
		dollernumb.isDisplayed();
	}
	
	public void VerifyAvaliabel() {
		
		avaliable.isDisplayed();
	}
	
	public void VerifyDollernum1() {
		
		dollernumb1.isDisplayed();
	}
	
}
