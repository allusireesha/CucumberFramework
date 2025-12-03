package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;

public class SFloginpage extends BasePage{

	public SFloginpage(WebDriver driver) {
		super(driver);
		
		 addObject("username", By.id("username"));
		 addObject("password", By.id("password"));
		 addObject("login", By.id("Login"));
		 addObject("verifytext", By.id("error"));
		 addObject("enterOTP", By.id("emc"));
		 addObject("verify", By.xpath("//input[@title='Verify']"));
		
			
			addObject("rememberme",By.name("rememberUn"));
			
			
			addObject("forgotpassword",By.id("forgot_password_link"));
			addObject("forgot_username", By.id("un"));
			addObject("continue", By.id("continue"));
			addObject("resetmessage", By.className("message"));
			addObject("errormessage", By.id("error"));
			addObject("usernameid", By.id("idcard-identity"));
			
	}

}
