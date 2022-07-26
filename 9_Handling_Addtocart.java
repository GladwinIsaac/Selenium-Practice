package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAddtocart {
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demotestingweb.com/seleniumPractise/#/");
		List<WebElement> allproducts=driver.findElements(By.xpath("//h4[@class='product-name']"));
	for (int i=0;i<=allproducts.size();i++) {
		String prod=allproducts.get(i).getText();
		if(prod.contains("Cucumber"))
		{
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
	}
	}

}
