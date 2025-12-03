Feature: UserMenu Test Cases

Background:
Given User launch the application
@tc05
Scenario: TC05-select usermenu dropdown
Given User is on "HomePage"
Then verify the home tab selected "title" "Sireesha Allu"
Then user click on link "usermenu"
And verify the usermenu options"usermanu" "My Profile,My Settings,Developer Console,Switch to Lightning Experience,Logout"


@tc08
Scenario: TC08-Developer console

Given user is on "HomePage"
#Then user verify home page is displayed "home"
When user click on the Button "usermenu"
Then user verify the text "usermenuoptions" "Developer Console"
Then user verify new window is opened "developerconsolewindow"
When user close the window "developerconsolewindow"
Then user back to main window

@tc09
Scenario: Selcect Logout Option from usermenu
Given user is on "UserMenuPage"
When user click on usermenu "usermenu"
Then user click on logout "logout"




