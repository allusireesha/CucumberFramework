package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;

public class AccountsPage extends BasePage{

	public AccountsPage(WebDriver driver) {
		super(driver);
		 
		 addObject("newaccount",By.xpath("//h2[text()=\"New Account\"]"));
		addObject("title",By.xpath("//h1[text()=\"Accounts\"]"));
		addObject("accountstab", By.xpath("//a[@title='Accounts Tab']"));
		 addObject("newbutton", By.name("new"));
		 addObject("accountname", By.id("acc2"));
		 addObject("accounttypedropdown", By.id("acc6"));
		 addObject("customerprioritydropdown", By.id("00Ng5000000HQm6"));
		 addObject("save", By.xpath("(//input[@title=\"Save\"])[1]"));
		 addObject("save", By.xpath("(//input[@title=\"Save\"])[1]"));
		 
		//edit view elements
		
		 addObject("createnewview", By.xpath("//a[text()=\"Create New View\"]"));
		 addObject("Viewdropdown", By.id("fcf"));
		 addObject("Edit", By.xpath("//a[text()='Edit']"));
		 addObject("ViewName", By.id("fname"));
		 
		 addObject("uniquename", By.id("devname"));
		 addObject("FilterFieldropdown", By.id("fcol1"));
		 addObject("Operatordropdown", By.id("fop1"));
		 addObject("Value", By.id("fval1"));
		 addObject("AvaialbleFieldsdropdown", By.id("colselector_select_0"));
		 addObject("save", By.name("save"));
		 //merge account
		 addObject("Mergeaccount", By.xpath("//a[text()='Merge Accounts']"));
		 addObject("SearchAccount", By.id("srch"));
		 addObject("FindAccount", By.xpath("//input[@value='Find Accounts']"));
		 addObject("checkbox1", By.id("cid0"));
		 addObject("checkbox2", By.id("cid1"));
		 addObject("next", By.xpath("(//input[@name='goNext'])[1]"));
		 addObject("merge", By.xpath("(//input[@value=' Merge '])[1]"));
		 //account report
		 addObject("Reportlink", By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		 addObject("DateFieldDropDown", By.id("ext-gen20"));
		 addObject("Createdate", By.xpath("//div[contains(text(),'Created Date')]"));
		 addObject("FromDate", By.xpath("//img[@id='ext-gen153']"));
		 addObject("Save", By.id("ext-gen50"));
		 addObject("ReportName", By.name("reportName"));
		 addObject("UName", By.name("reportDevName"));
		 addObject("SaveandRun", By.id("ext-gen338"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
