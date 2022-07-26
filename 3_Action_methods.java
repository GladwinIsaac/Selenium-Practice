package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Demo3 {
		//action-mouse hovering,Entering in CAPS,Pending-Rightclick,doubleclick
	static
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.makemytrip.com");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='truncate airPortName ']/parent::p[@title='BLR, Kempegowda International Airport India']"))).build().perform();
*/
		driver.get("https://demoqa.com/tool-tips");
		WebElement ele=driver.findElement(By.id("toolTipTextField"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		String d=driver.findElement(By.className("tooltip-inner")).getText();	
		System.out.println(d);
		ac.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("KingGlad").doubleClick().build().perform();
		
		
		
	}

}
