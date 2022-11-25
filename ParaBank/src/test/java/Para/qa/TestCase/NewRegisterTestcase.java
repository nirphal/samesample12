package Para.qa.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Para.qa.Base.TestBase;
import Para.qa.pages.RegisterHomePage;
import Para.qa.pages.RegisterPage;
import Para.*;

public class NewRegisterTestcase extends TestBase {
//   RegisterPage Registerpage;
//	RegisterHomePage registerhomepage;
//	NewRegisterTestcase newregisterTestCase;
	
	RegisterPage registerpage;
	RegisterTestCase registerTestCase;
	RegisterHomePage registerhomepage;
	public NewRegisterTestcase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		registerhomepage=new RegisterHomePage();
		registerpage=new RegisterPage();
		registerTestCase= new RegisterTestCase();
		
		
	}
	
//	@Test
//	public void RegisterPage() {
//		registerpage.Registerpage();
//	}
//	
	
	@Test
	public void RegisterHomepage()  {
//		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
//		register.click();
		registerpage.Registerpage();;
	  
		//registerhomepage.verifyFistName(prop.getProperty("firstname"));
		
		
		registerhomepage.verifyFistName(prop.getProperty("firstname"));
		registerhomepage.verifyLastName(prop.getProperty("lastname"));
		registerhomepage.verifyStreet(prop.getProperty("addr"));
		registerhomepage.verifyCity(prop.getProperty("City"));
		registerhomepage.verifyState(prop.getProperty("State"));
		registerhomepage.verifyZip(prop.getProperty("Zipcode"));
		registerhomepage.verifyphonenumber(prop.getProperty("Phnumber"));
		registerhomepage.verifyssn(prop.getProperty("Ssn"));
		registerhomepage.verifyusername(prop.getProperty("username"));
		registerhomepage.verifypass(prop.getProperty("pass"));
		registerhomepage.repatpwd(prop.getProperty("repeatpwd"));
		registerhomepage.verifyReg();
		
		
	
		
	}
}
