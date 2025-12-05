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
		//driver.get("https://login.salesforce.com/");
		
		String link="00Dg5000000BxkA!AQEAQA2Doi87zQA3iqnIx3lw1AlYQjZcZ.dcxjfgVchTgMxkwiGaG8RYwL2tsGc3EgoWPI2379ksC2VmWCqwj1qT2LgrW7Ay";
		driver.get("https://orgfarm-9ceae230c4-dev-ed.develop.my.salesforce.com/secur/frontdoor.jsp?sid="+link);		
		
		return driver;
	}
	
}
