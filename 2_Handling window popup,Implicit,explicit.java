package org.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo2 {
//Handling window popup,Implicit,explicit
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();  
		WebDriverWait wait=new WebDriverWait(driver, 15);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.fedex.com/ratetools/RateToolsMain.do");
		String WindHandlebefore=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='| Help']")).click();
		
		/*for(String windowHandle:driver.getWindowHandles())
		{
			
			driver.switchTo().window(windowHandle);
			
		}
		System.out.println(driver.getTitle());
		String HelpText=driver.findElement(By.xpath("//h1[text()='Help Options']")).getText();
		if(HelpText.contains("Help Options")) {
			System.out.println("Im in new Window");
		}
		else
		{
			System.out.println("Not Available");
		}
		driver.close();
		driver.switchTo().window(WindHandlebefore);
		driver.close(); */
		
		Set<String> newwindow=driver.getWindowHandles();
		Iterator<String> Allwindows=newwindow.iterator();
		
		while(Allwindows.hasNext())
		{
			String childWindow=Allwindows.next();
			if(!childWindow.equalsIgnoreCase(WindHandlebefore))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				WebElement HelpText=driver.findElement(By.xpath("//h1[text()='Help Options']"));
				wait.until(ExpectedConditions.textToBePresentInElement(HelpText, "Help Options"));
				//System.out.println(HelpText);
				
				System.out.println(HelpText.getText());
			}
		}
		
	}

}
