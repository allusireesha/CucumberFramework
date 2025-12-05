Feature: Lead Tab Test cases
Background:
Given User launch the application


@tc20
Scenario: TC20-leadtab
Given User is on "LeadsPage"
When user click on the Tab "leadstab"
Then Leads home page should be displayed
#20done
@tc21
Scenario: TC21-Leads Select View
Given User is on "LeadsPage"
When user click on the Tab "leadstab"
Then Leads home page should be displayed
Then user click on dropdown "viewdropdown"
Then pdown contains the following values:
      | All Open Leads          |
      | My Unread Leads         |
      | Recently Viewed Leads   |
      | Today's Leads           |
      | view custom 1           |
      | view custom 2           |






