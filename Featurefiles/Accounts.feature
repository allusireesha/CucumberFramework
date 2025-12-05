Feature: Testcases for Accounts Tab
Background:
Given User launch the application

@tc10
Scenario: TC10-Create new account
Given User is on "AccountsPage"
Then user click on Tab "accountstab"
Then user Click on the  Button "newbutton"
Then user Enter into textbox "accountname" "Testaccount"
Then select from dropdown "accounttypedropdown" "Technology Partner"
Then select from dropdown "customerprioritydropdown" " High"
Then click on Button "save"

@tc11
Scenario: TC11-Create new view
Given User is on "AccountsPage"
Then user click on Tab "accountstab"
Then user click on link "createnewview"
Then user Enter into textbox "ViewName" "accountview"
Then user Enter into textbox "uniquename" "accountview"
Then user Click on the  Button "save"
#11done

@tc12
Scenario: TC12-Edit view
Given User is on "AccountsPage"
Then user click on Tab "accountstab"
Then click on Button "Edit"
Then user Enter into textbox "ViewName" "newaccountview"
Then user Enter into textbox "uniquename" "newaccountview"
Then select from dropdown "FilterFieldropdown" "Account Name"
Then select from dropdown "Operatordropdown" "equals"
Then user Enter into textbox "Value" "a"
Then select from dropdown "AvaialbleFieldsdropdown" "Last Activity"
Then click on Button "save"


