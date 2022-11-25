package Para.qa.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Para.qa.Base.TestBase;
import Para.qa.pages.RegisterPage;

public class RegisterTestCase extends TestBase {
	
	RegisterPage registerpage;
	RegisterTestCase registerTestCase;
	public RegisterTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		registerpage=new RegisterPage();
		registerTestCase= new RegisterTestCase();
		
	}
	
	@Test
	public void RegisterPage() {
		registerpage.Registerpage();
		
	}
	
	
	
	
	
	
	
	
//   @AfterMethod
//     public void beardown() {
//		driver.quit();
//	}
//
//	
		
	

}
