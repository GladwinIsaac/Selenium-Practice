package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//Autosuggestive
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Che");
		Thread.sleep(2000);
		List<WebElement> FromSearch= driver.findElements(By.xpath("//ul[@class='autoFill']//li"));
		
		for (WebElement FromKeyword : FromSearch) {
			System.out.println(FromKeyword.getText());
			if (FromKeyword.getText().equalsIgnoreCase("Sholinganallur, Chennai")) {
				FromKeyword.click();
				break;
			}
		}
	}
}
