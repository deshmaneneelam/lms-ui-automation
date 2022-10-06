#Author: deshmane.neelam@gmail.com
Feature: Add Program

  Scenario: Validate Add New Program
    Given User is logged on to LMS website
    When User clicks A New Program button
    Then User lands on Program Details form