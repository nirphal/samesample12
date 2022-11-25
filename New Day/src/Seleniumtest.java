import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\vn22275\\eclipse-workspace\\New Day\\Drivers\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
           driver.get("https://www.gmail.com");
           
           
          
	}

}
