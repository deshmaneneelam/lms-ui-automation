#Author: deshmane.neelam@gmail.com
Feature: Search Program

  Scenario: Select Program

    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected		 
		   
Scenario: Edit Feature
	Given User is on Program page after login
	When User clicks on edit button	
	Then User lands on Program Details form
	