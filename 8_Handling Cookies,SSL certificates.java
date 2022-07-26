package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//HTTPS ,ssl cert handling & deleting the cookies
public class Demo9 {
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		//cap.acceptInsecureCerts();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions ch=new ChromeOptions();
		ch.merge(cap);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		
	}

}
