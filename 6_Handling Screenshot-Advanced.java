import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;

public class screenshots {
public static void main(String[] args) throws Exception {
    WebDriver driver;
    //put correct path for Gecko driver
    System.setProperty("webdriver.gecko.driver", "G:/Selenium Driver/Gecko/geckodriver.exe");
    driver = new FirefoxDriver();
    driver.get("https://google.com");
    screenShot(driver);
    screenShot(driver);
    screenShot(driver);
}

public static void screenShot(WebDriver driver) throws IOException, InterruptedException {
    File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("C:/Users/dayan/screenshot_" + timestamp() + ".png");
    FileUtils.copyFile(scr, dest);
    Thread.sleep(3000);
}

public static String timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
} }







package org.practice;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo6 {
	//screenshot,window popup accept
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Date d=new Date();
		String filename=d.toString().replace(":", "_").replace(" ", "_")+".png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File("F:\\screenshot.png"));
		FileHandler.copy(screenshot, new File("F:\\"+filename));
		
		
	}

}
