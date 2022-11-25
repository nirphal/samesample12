package gitD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vn22275\\eclipse-workspace\\Demo\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/category/interview/");
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
	//	WebElement addr1=driver.findElement(By.xpath("(//span[@class='nav-drop-title-wrap'])[9]"));
		
		Thread.sleep(3000);
		
		//Actions act=new Actions(driver);
		
		WebElement addr2=driver.findElement(By.xpath("//a[text()='Blog']"));
		
		addr2.click();
		
		Thread.sleep(3000);
		
		WebElement addr3=driver.findElement(By.xpath("//body[@class='blog wp-custom-logo wp-embed-responsive wp-schema-pro-2.7.3 cp_aff_false hfeed footer-on-bottom animate-body-popup social-brand-colors hide-focus-outline link-style-standard has-sidebar has-sticky-sidebar-widget content-title-style-above content-width-normal content-style-boxed content-vertical-padding-show non-transparent-header mobile-non-transparent-header']"));
		
		addr3.click();
		
		//act.moveToElement(addr1).perform();
		
		Thread.sleep(3000);
		
		//Alert alt=driver.switchTo().alert();
		
	//	Thread.sleep(9000);
		//alt.accept();
		

	}

}
