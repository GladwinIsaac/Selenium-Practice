package org.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	//Window maximize,navigate to,scrollBy
	
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.navigate().back();
		//driver.navigate().forward();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    
	    
		
	}

}
