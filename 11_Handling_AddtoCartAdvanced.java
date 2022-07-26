package org.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAddtoCartAdvanced {
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String[] itemneeded= {"Brocolli","Beans","Potato"};
		
		driver.get("https://demotestingweb.com/seleniumPractise/#/");
		addItems(driver,itemneeded);
		
		
		
		
	
	}
	public static void addItems(WebDriver driver, String[] itemneeded) {
		// TODO Auto-generated method stub
		List<WebElement> allproducts=driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		for(int i=0;i<allproducts.size();i++)
		{
			String[] name=allproducts.get(i).getText().split("-");
			String selectedname=name[0].trim();
			List itemneededlist=Arrays.asList(itemneeded);
			
			
			if (itemneededlist.contains(selectedname))
			{
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==itemneededlist.size())
				{
					break;
				}
			}
		}
	}

}
