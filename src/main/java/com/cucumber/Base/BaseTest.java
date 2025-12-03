package com.cucumber.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	public WebDriver LaunchtheApplication() {
		
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
			driver=new ChromeDriver(options);
		}
		driver.get("https://login.salesforce.com/");
		
		
		return driver;
	}
	
}
