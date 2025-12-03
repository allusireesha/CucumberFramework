package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;

public class ContactsPage extends BasePage {

	public ContactsPage(WebDriver driver) {
		super(driver);
		
		addObject("Contact", By.xpath("//a[text()='Contacts']"));
		addObject("New", By.name("new"));
		addObject("LastName", By.xpath("//input[@id='name_lastcon2']"));
		addObject("AccountName", By.id("con4"));
		addObject("Save", By.className("btn"));
		addObject("CreateNewView", By.xpath("//a[text()='Create New View']"));
		addObject("ViewName", By.id("fname"));
		addObject("UniqueName", By.id("devname"));
		addObject("save", By.xpath("(//input[@title='Save'])[1]"));
		addObject("RecentlyCreatedDropDown", By.id("hotlist_mode"));
		addObject("ContactsViewdropdown", By.id("fcf"));
		addObject("Name", By.xpath("//a[text()='last']"));
		addObject("CreateNewView", By.xpath("//a[text()='Create New View']"));
		addObject("UniqueName", By.id("devname"));
		addObject("save", By.xpath("(//input[@title='Save'])[1]"));
		addObject("ErrorMessage", By.id("errorMsg"));
		addObject("Cancel", By.name("cancel"));
		addObject("SaveandNew", By.className("save_new"));
		
		
	}

}
