#Author: Kanupriya Kumar
Feature: Batch page user interface functionality

  Scenario: Validate batch page heading
    Given User is logged on to LMS website
    When User is on Batch page
    Then User should see the Batch page heading

  Scenario: Validating the default state of Delete button
    Given User is logged on to LMS website
    When User is on Batch page
    Then verify that the Delete button next to the search box is Disabled

  Scenario: Validating the number of records displayed
    Given User is logged on to LMS website
    When User is on Batch page
    Then verify that number of records displayed on the page are 5

  Scenario: Validate search box functionality on Batch page
    Given User is on the Batch page
    When user clicks on search box with batch name entered in it
    Then records of that  batch name are displayed

  Scenario: Validate Edit button functionality
    Given User is on Batch page
    When User clicks on Edit button
    Then User lands on Batch Details form

  Scenario Outline: Validate Batch details form functionality
    Given User is on Batch details page
    When User edits <Name>, <Description>, <ProgramName>, <Status>, <NoOfClasses>
    Then User can see updated values of <Name>, <Description>, <ProgramName>, <Status>, <NoOfClasses>

Examples:
|Name | SDET01|
|Description|Testing|
|ProgramName|Software|
|Status|Active|
|NoOfClasses|10|

  Scenario: 
