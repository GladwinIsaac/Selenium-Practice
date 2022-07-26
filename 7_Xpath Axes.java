package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	//Sibling,following
//li[@class='appendBottom5']//a[contains(@href,'en-th')]-to select Thailand
//li[@class='appendBottom5']//a[contains(@href,'en-th')]//following::li -To find the element after Thailand where all li will be searched
//*[@class='specialFare']//following-sibling::li
//li[@class='appendBottom5']//a[contains(@href,'en-th')]//preceding::input

public class Demo8 {
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		List<WebElement> d=driver.findElements(By.xpath("//a[contains(text(),'SELENIUM')]//preceding-sibling::div[@class='rt-grid-2 rt-omega']"));
		
		for(WebElement dd:d)
		{
			System.out.println(dd.getText());
		}
		
	}

}
