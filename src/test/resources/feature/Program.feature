#Author: deshmane.neelam@gmail.com
Feature: Program

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
