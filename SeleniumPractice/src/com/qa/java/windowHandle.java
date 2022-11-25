package com.qa.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class windowHandle{

	//private static final String[] Handles = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vn22275\\eclipse-workspace\\Demo\\drivers\\chromedriver.exe")  ;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles= driver.getWindowHandles();
		
		for (String Childwindow : handles) {
			
			System.out.println(Childwindow);
			
			if(!Childwindow.equals(parentwindow)) {
				
				driver.switchTo().window(Childwindow);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.id("firstName")).sendKeys("vaibhav");
				Thread.sleep(5000);
				driver.close();
				
			}
			
		}
		driver. switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("nirphal");
		driver.findElement(By.className("linkedin")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[2]")).click();
		Set<String> handles1= driver.getWindowHandles();
		
  		for (String window1 : handles1) {
			System.out.println(window1);
			if(!window1.equals(parentwindow)) {
				
				driver.switchTo().window(window1);
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd@gmail.com");
				
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
			    File trg= new File ("C:\\Users\\vn22275\\eclipse-workspace\\SeleniumPractice\\Screenshot") ;
				
				//Files.copy(src, trg);
			    
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
//		String Parentwindow=driver.getWindowHandle();
//		System.out.println("parent window" +Parentwindow );
//		
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> handles=driver.getWindowHandles();
//		
//		for (String handle : handles) {
//			
//			System.out.println(handle); 
//			
//			if(!handle.equals(Parentwindow)) {
//				driver.switchTo().window(handle);
//				Thread.sleep(2000);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("vaibhav");
//				Thread.sleep(2000);
//				driver.close();
//			}
//		
//		}
//		Thread.sleep(2000);
//		driver.switchTo().window(Parentwindow);
//		driver.findElement(By.id("name")).sendKeys("nirphal");
//		Thread.sleep(2000);
//		 
//		
		 
		
		

		
		
	
		
		
		


	}

}
