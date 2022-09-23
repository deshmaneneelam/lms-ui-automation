#Author: deshmane.neelam@gmail.com
Feature: Search Program

  Scenario: Validate Search Feature
    Given User is logged on to LMS website
    When User is on Program page
    Then Text box used for search has text as search

  Scenario Outline: Search Program By Name 
    Given User is logged on to LMS website
    When User enters <searchPhrase> into search box
    Then Entries for text are shown
    
    Examples:
		| searchPhrase |
		 |RPA|
		 |testing|
		 |sdet|
		     
    
    
   