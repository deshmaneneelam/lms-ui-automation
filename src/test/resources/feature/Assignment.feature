#Author: Kanupriya Kumar
Feature: Assignment page module

  Scenario: Validate the heading of Assignment page
    Given user is logged on part of Assignment module
    When user is on Assignment page
    Then user should see the page heading of Assignment page

  Scenario: Validate the text below Assignment table
    Given user is logged on part of Assignment module
    When user is on Assignment page
    Then user should verify the records dispalyed below Assignment table

  Scenario: Validating the number of records displayed in footer for Assignment page
    Given user is logged on part of Assignment module
    When user is on Assignment page
    Then user should verify footer message of records displayed on Assignment page

  Scenario: Validating search text displayed in seacr box on Assignment page
    Given user is logged on part of Assignment module
    When user is on Assignment page
    Then user should validate search textbox has text as search on Assignment page

  Scenario Outline: Validate search name displayed in records on Assignment page
    Given user is logged on part of Assignment module
    When user clicks on Assignment search box with text entered in it
    Then records of that  "<AssignmentName>" are displayed for Assignment page

    Examples: 
      | AssignmentName |
      | SQL15          |

  Scenario: Validate selecting assignment checkbox
    Given user is logged on part of Assignment module
    When user selects assignment using checkbox
    Then assignment gets selected

  Scenario: Edit feature Assignment page
    Given user is logged on part of Assignment module
    When user clicks on edit button on assignment page
    Then user lands on assignment details form

 

 