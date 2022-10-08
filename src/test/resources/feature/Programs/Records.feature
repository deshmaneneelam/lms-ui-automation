#Author: deshmane.neelam@gmail.com
Feature: Number of records

  Scenario: Validate that number of records rows of data in the table displayed
    Given User is logged on to LMS website
    When User is on Program page
    Then Verify that number of records displayed
