package Para.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
//
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try
		{
		prop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\vn22275\\eclipse-workspace\\ParaBank\\src\\main\\java\\Para\\qa\\config\\config.properties");
		prop.load(fi);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}	
		
	}
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vn22275\\eclipse-workspace\\ParaBank\\driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
		
	
	

}
