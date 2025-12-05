package com.cucumber.Steps;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base.BasePage;
import com.cucumber.Base.BaseTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceSteps extends BaseTest{
	BasePage page;
	public static WebDriver driver;
	
	@Given("User launch the application")
	public void user_launch_the_application() {
		driver=LaunchtheApplication();
	}

@Given("User is on {string}")
public void user_is_on(String pagename) {
	String packageName="com.cucumber.Pages";
	   String fullpath=packageName+"."+pagename;
		
		try {
			page=(BasePage)Class.forName(fullpath).getDeclaredConstructor(WebDriver.class).newInstance(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
}

@When("user Enter into textbox {string} {string}")
public void user_enter_into_textbox(String elementName, String inputData) {
    page.enterintoTextBox(elementName, inputData);
}
@Then("user Click on the  Button {string}")
public void user_click_on_the_button(String elementName) {
    page.ClickonButton(elementName);
}
@When("user wait to enter OTP {string}")
public void user_wait_to_enter_otp(String elementName) {
    try {
		page.EnterOtp(elementName);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Then("user verift text\"pagename\" {string}")
public void user_verift_text_pagename(String elementName) {
    page.verifttitle(driver);
}

@Then("user click on checkbox {string}")
public void user_click_on_checkbox(String elementName) {
    page.clickonCheckbox(elementName);
}
@When("user click on dropdown {string}")
public void user_click_on_dropdown(String elementName) {
    page.clickonDropdown(elementName);
}
@Then("user click on the  link {string}")
public void user_click_on_the_link(String elementName) {
    page.clickonLink(elementName);
}
@Then("user verify the data {string} {string}")
public void user_verify_the_data(String elementName, String inputData) {
    page.verifytext(elementName, inputData);
}
@Then("user verify the data is selected {string}")
public void user_verify_the_data_is_selected(String elementName) {
    page.verifytext(elementName, elementName);
}




@Then("user verift the text\"header\" {string}")
public void user_verift_the_text_header(String elementName) {
   page.verifytext(elementName, elementName);
}
@Then("user verify the text {string} {string}")
public void user_verify_the_text(String elementName, String inputData) {
    page.verifytext(elementName, elementName);
}

@Then("user click on Tab {string}")
public void user_click_on_tab(String elementName) {
    page.clickonTab(elementName);
}
@Then("verify user is on {string}")
public void verify_user_is_on(String elementName) {
    page.verifytext(elementName, elementName);
}
@Then("user click on dropdown \"opportunityDropdown'")
public void user_click_on_dropdown_opportunity_dropdown() {
    page.clickonDropdown(null);
}
@Then("verify opportunity dropdown contain the following values:")
public void verify_opportunity_dropdown_contain_the_following_values(io.cucumber.datatable.DataTable dataTable) {
    page.verifyDropdownValues(null, null);
}


@Then("click on Button {string}")
public void click_on_button(String elementName) {
    page.ClickonButton(elementName);
}
@Then("enter into text box {string} {string}")
public void enter_into_text_box(String elementName, String inputData) {
    page.enterintoTextBox(elementName, inputData);
}
@Then("select from dropdown {string} {string}")
public void select_from_dropdown(String elementName, String inputData) {
    page.selectFromDropdown(elementName, inputData);
}
@Then("enter into textbox {string} {string}")
public void enter_into_textbox(String elementName, String inputData) {
    page.enterintoTextBox(elementName, inputData);
}
@Then("verify new opportunitypage is created")
public void verify_new_opportunitypage_is_created() {
    page.verifytext(null, null);
}
@Then("verify page is displayed {string}")
public void verify_page_is_displayed(String pagename) {
    page.verifyPageIsDisplayed(pagename);
}




@When("user click on the Tab {string}")
public void user_click_on_the_tab(String elementName) {
    page.clickonTab(elementName);
}
@Then("Leads home page should be displayed")
public void leads_home_page_should_be_displayed() {
 
}

@Then("user click on link {string}")
public void user_click_on_link(String elementName) {
    page.clickonLink(elementName);
}

@Then("verify the home tab selected {string} {string}")
public void verify_the_home_tab_selected(String elementName, String inputData) {
    page.verifydata(elementName, inputData);
}





@Then("user verify new window is opened {string}")
public void user_verify_new_window_is_opened(String elementName) {
   page.verifttitle(driver);
}
@When("user close the window {string}")
public void user_close_the_window(String elementName) {
    page.closeCurrentWindow();
}
@Then("user back to main window")
public void user_back_to_main_window() {
    page.switchToMainWindow();
}














@After
public void teardown(Scenario scenario) {
	byte[] screenshot = null;
	screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot,"image/png",scenario.getName());
	
	driver.close();
	driver=null;
	
}
}