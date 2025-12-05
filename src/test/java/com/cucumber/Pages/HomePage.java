package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	

	addObject("usermenu", By.id("userNavLabel"));
	addObject("usermenudropdown", By.id("userNav-menuItems"));
	addObject("title", By.id("userNavLabel"));
	
	addObject("developerconsole", By.xpath("//a[text()='Developer Console']"));
	//addObject("home", By.xpath("//a[contains(text(),'Home')]"));
	addObject("logout", By.xpath("//a[text()='Logout']"));
	addObject("myprofile", By.xpath("//a[text()='My Profile']"));
	addObject("mysettings", By.xpath("//a[@title='My Settings']"));
	
	addObject("home", By.xpath("//a[text()=\"Home\"]"));
	
	
	addObject("opportunitiestab", By.id("Opportunity_Tab"));
	//addObject("opportunities", By.xpath("//a[@title='Opportunities Tab']"));//Opportunity_Tab
	addObject("contacts", By.xpath("//a[@title='Contacts Tab']"));
	
	
	
	
}
}