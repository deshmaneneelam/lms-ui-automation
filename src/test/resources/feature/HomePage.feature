#Author: Kanupriya Kumar
Feature: Home page module

Scenario: Validate title of Home Page
Given User is logged on to LMS website
When user lands on the home page
Then verify the title of the Home page

Scenario: Validate menu bar heading
Given User is logged on to LMS website
When user lands on the home page
Then verify the heading of home page

Scenario: Verify menu bar buttons
Given User is logged on to LMS website
When user lands on the home page
Then user is able to verify the button visibility and text of all menu bar items
  


