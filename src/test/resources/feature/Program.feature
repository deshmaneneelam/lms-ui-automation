#Author: deshmane.neelam@gmail.com
Feature: Program Heading

  Scenario: Validate the heading
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see a heading Manage Program

  Scenario: Validate footer
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the footer as in total there are z programs

  Scenario: Validating the default state of Delete button
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the Delete button on the top left hand side as Disabled

  Scenario: Validate that number of records rows of data in the table displayed
    Given User is logged on to LMS website
    When User is on Program page
    Then Verify that number of records displayed

  Scenario: Validate Search Feature
    Given User is logged on to LMS website
    When User is on Program page
    Then Text box used for search has text as search
    
    Scenario: Search Program By Name
    Given User is on Program page
    When User enters text into search box.
    Then Entries for text are shown.
    

  Scenario: Validate Add New Program
    Given User is logged on to LMS website
    When User clicks A New Program button
    Then User lands on Program Details form
