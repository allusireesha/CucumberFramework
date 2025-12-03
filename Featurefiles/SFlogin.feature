Feature: Login into Salesforce Application all test cases

Background:
Given User launch the application

Scenario: TC01-Login Error Message

Given User is on "SFloginpage"
When user Enter into textbox "username" "allu.siree214@agentforce.com"
Then user Click on the  Button "login"
Then user verify the text "verifytext" "Error: Please enter your password."

@tc2
Scenario: TC02-Login to Salesforce Page

Given User is on "SFloginpage"
When user Enter into textbox "username" "allu.siree214@agentforce.com"
When user Enter into textbox "password" "Salesforce19"
Then user Click on the  Button "login"
When user wait to enter OTP "enterOTP"
Then user Click on the  Button "verify"
Then User is on "HomePage"
And user verift text"pagename" "Home"

@tc3
Scenario: TC03-Check Rememberme
Given User is on "SFloginpage"
When user Enter into textbox "username" "allu.siree214@agentforce.com"
When user Enter into textbox "password" "Salesforce19"
Then user click on checkbox "rememberme"
Then user Click on the  Button "login"
When user wait to enter OTP "enterOTP"
Then user Click on the  Button "verify"
Then User is on "HomePage"
Then user verift text"pagename" "Home"
When user click on dropdown "usermenu" 
Then user click on the  link "logout"
Then User is on "SFloginpage"
Then user verify the data "usernameid" "allu.siree214@agentforce.com"
And user verify the data is selected "rememberme"

@tc4a
Scenario: TC4a-Test Forgot Password

Given User is on "SFloginpage"
Then user click on the link "forgotpassword"
Then user verift the text"header" "Reset Your Password"
When user Enter into textbox "forgot_usermenu" "allu.siree214@agentforce.com"
Then user Click on the  Button "continue"
And  user verify the text "header" "Check Your Email"

@tc4b
Scenario: TC4b-Forgot Password

Given User is on "SFloginpage"
When user Enter into textbox "username" "allu"
When user Enter into textbox "password" "Salesforce"
Then user Click on the  Button "login"
And user verify the text "errormessage" "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator." 








