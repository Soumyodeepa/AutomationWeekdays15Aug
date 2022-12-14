package com.seleniumdemo.day2;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocatorDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.firstflight.com.sg/";
		driver.get(url);

		
//		WebElement  textareaTrack = driver.findElement(By.cssSelector("#track_awbs"));
		
		
//		WebElement  textareaTrack = driver.findElement(By.cssSelector(".t-area"));
//		WebElement  textareaTrack = driver.findElement(By.cssSelector("textarea[id='track_awbs']"));
//		WebElement  textareaTrack = driver.findElement(By.cssSelector("[id='track_awbs']"));
//		WebElement  textareaTrack = driver.findElement(By.cssSelector("textarea[id='track_awbs'],[name='AWB']"));
//		WebElement  textareaTrack = driver.findElement(By.cssSelector("textarea[id^='track']"));
//		WebElement  textareaTrack = driver.findElement(By.cssSelector("textarea[id$='awbs']"));
		WebElement  textareaTrack = driver.findElement(By.cssSelector("textarea[id*='ck_aw']"));
		
		
		textareaTrack.clear();
		textareaTrack.sendKeys("Hello World");
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
