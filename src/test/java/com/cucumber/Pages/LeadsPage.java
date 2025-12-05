package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {
		super(driver);
		addObject("leadstab", By.xpath("//a[@title='Leads Tab']"));
		//addObject("leads", By.xpath("//a[text()='Leads']"));
		//addObject("leads", By.xpath("//a[@title='Leads Tab']"));
		 //addObject("leads", By.id("Lead_Tab"));
		// addObject("view", By.id("fcf"));
		 addObject("viewdropdown", By.id("fcf"));
		 addObject("Go", By.className("btn"));
		 addObject("New", By.xpath("//input[@value=' New ']"));
		 addObject("LastName", By.id("name_lastlea2"));
		 addObject("Company", By.id("lea3"));
		 addObject("Save", By.xpath("(//input[@value=' Save '])[1]"));
		 
		 
	}

}
