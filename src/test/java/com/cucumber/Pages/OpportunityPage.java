package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;

public class OpportunityPage extends BasePage {

	public OpportunityPage(WebDriver driver) {
		super(driver);
		addObject("opportunitiestab", By.id("Opportunity_Tab"));
		//addObject("opportunities", By.xpath("//a[@title='Opportunities Tab']"));//Opportunity_Tab
		 //addObject("opportunities",By.xpath("//a[@title='Opportunities Tab']"));
		// addObject("opportunities", By.xpath("//a[contains(text(),'Opportunities')]"));
		 addObject("opportunityDropdown", By.id("fcf"));
		 addObject("opportunitiesHeader", By.xpath("//h1[contains(text(),'Opportunities')]"));
		 addObject("PipeLine", By.xpath("//a[text()='Opportunity Pipeline']"));
		 //addObject("new", By.xpath("//input[@value=' New ']"));
		 addObject("new", By.name("new"));
		 addObject("opportunityname", By.id("opp3"));
		 addObject("accountname", By.id("opp4"));
		 addObject("closedate", By.id("opp9"));
		 addObject("stage", By.id("opp11"));
		 addObject("probability", By.id("opp12"));
		 addObject("leadsource", By.id("opp6"));
		 addObject("PrimaryCompainSource", By.id("opp17"));
		 addObject("save", By.xpath("(//input[@title='Save'])[1]"));
		 addObject("StuckOppurtunity", By.xpath("//a[text()='Stuck Opportunities']"));
		 addObject("interval", By.id("quarter_q"));
		 addObject("include", By.id("open"));
		 addObject("runreport", By.xpath("//input[@title='Run Report']"));
		 
    
	}

}
