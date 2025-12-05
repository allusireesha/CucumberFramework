Feature: UserMenu Test Cases

Background:
Given User launch the application
@tc05
Scenario: TC05-select usermenu dropdown
Given User is on "HomePage"
Then verify the home tab selected "title" "Sireesha Allu"
Then user click on link "usermenu"
Then user verify dropdown values "usermenu":
|My Profile|
|My Settings|
|Developer Console|
|Switch to Lightning Experience|
|Logout|


@tc08
Scenario: TC08-Developer console

Given User is on "HomePage"
Then verify the home tab selected "title" "Sireesha Allu"
Then user click on link "usermenu"
Then user click on link "developerconsole"
Then user verify new window is opened "developerconsolewindow"
When user close the window "developerconsolewindow"
Then user back to main window
#08-done
@tc09
Scenario: Selcect Logout Option from usermenu
Given User is on "HomePage"
Then user click on link "usermenu"
Then user click on link "logout"
#09-done



