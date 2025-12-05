Feature: Testcases for Opportunity Tab
Background:
Given User launch the application

@tc15
Scenario: TC15-Opportunity dropdown
Given User is on "OpportunityPage"
Then user click on Tab "opportunities"

Then user click on dropdown "opportunityDropdown'
Then verify dropdown contain the following values:

 	  | All Opportunities               |
      | Closing Next Month              |
      | Closing This Month              |
      | My Opportunities                |
      | New This Week                   |
      | New Last Week                   |
      | Recently Viewed Opportunities   |
      | Private                         |
      | Won                             |

@tc16
Scenario: TC16-Create New Opportunity
Given User is on "OpportunityPage"
When user click on Tab "opportunitiestab"
Then click on Button "new"
Then enter into text box "opportunityname" "myopp"
Then enter into text box "accountname" "myacc"
Then enter into text box "closedate" "11/28/2025"
Then select from dropdown "stage" "Closed Won"
Then enter into textbox "probability" "60"
Then select from dropdown "leadsource" "Phone Inquiry"
Then enter into text box "PrimaryCompainSource" "user"
Then click on Button "save"
And verify new opportunitypage is created

@tc17

Scenario: TC17-opportunity pipeline Report Test
Given User is on "OpportunityPage"
When user click on Tab "opportunitiestab"
Then user click on link "PipeLine"
#17done

@tc18
Scenario: TC18-Test Stuck Opportunities Report
Given User is on "OpportunityPage"
When user click on Tab "opportunitiestab"
Then user click on link "StuckOppurtunity"
#18done
@tc19
Scenario: TC19-Test Quarterly Summary Report
Given User is on "OpportunityPage"
When user click on Tab "opportunitiestab"
When select from dropdown "interval" "current FQ"
Then select from dropdown "include" "Open Opportunities"
When click on Button "runreport"












