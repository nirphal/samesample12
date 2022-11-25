package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vn22275\\eclipse-workspace\\firstproject\\Drivers\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.get("https://www.gmail.com");


}
}
