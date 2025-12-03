Feature: Lead Tab Test cases
Background:
Given User launch the application


@tc20
Scenario: TC20-leadtab
Given User is on  "LeadsPage"
When user click on the Tab "leads"
Then Leads home page should be displayed

@tc21
Scenario: TC21-Leads Select View
When user click on the Tab "leads"
Then Leads home page should be displayed
And user clicks on the leads dropdown
Then the leads dropdown should show the following values:
      | All Open Leads          |
      | My Unread Leads         |
      | Recently Viewed Leads   |
      | Today's Leads           |
      | view custom 1           |
      | view custom 2           |






