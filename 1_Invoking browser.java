package org.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
//invoking browser
	static
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		List<WebElement> lists=driver.findElements(By.id("F"));

				Iterator<WebElement> itr= lists.iterator();
				while(itr.hasNext())
				{
				System.out.println(itr.next().getText());
				}

			
		driver.close();
	}
	
}

