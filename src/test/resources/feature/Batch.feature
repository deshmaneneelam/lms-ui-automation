#Author: Kanupriya Kumar
Feature: Batch page user interface functionality

  Scenario: Validate batch page heading
    Given User is on website
    When User is on Batch page
    Then User should see the Batch page heading

  Scenario: Validating the default state of Delete button
    Given User is on website
    When User is on Batch page
    Then verify that the Delete button next to the search box is Disabled

  Scenario: Validating the number of records displayed
    Given User is on website
    When User is on Batch page
    Then verify that number of records displayed on the page are five

  Scenario Outline: Validate search box functionality on Batch page
    Given User is on website
    When user clicks on search box with "<BatchName>" entered in it
    Then records of that  "<BatchName>" are displayed

    Examples: 
      | BatchName |
      | SDET55    |

  Scenario: Validate Edit button functionality
    Given User is on website
    When User clicks on Edit button
    Then User lands on Batch Details form

  Scenario Outline: Validate Batch details form functionality
    Given User is on Batch details page
    When User enters "<Name>", "<Description>", "<ProgramName>", "<NoOfClasses>"
    Then User can see updated values of all fields

    Examples: 
      | Name   | Description | ProgramName | NoOfClasses |
      | SDET01 | Testing     | Software    |          10 |

  Scenario: Cancel edited changes
    Given User is on Batch details page
    When user clicks on cancel button
    Then user can see batch details are notupdated

  Scenario: Save edited changes
    Given User is on Batch details page
    When user clicks on save button
    Then user can see successful alert

  Scenario Outline: Verify editd batch details
    Given User is on website
    When user searches with newly updated batch "<Name>"
    Then User can see updated values of all fields

    Examples: 
      | Name   |
      | SDET01 |

  Scenario: Select multiple batches for deletion
    Given User is on website
    When user selects multiple batches
    Then multiple batches get selected

  Scenario: User lands on deletion form
    Given User is on website
    When user clicks on delete button
    Then user lands on deletion form

  Scenario: Confirm delete action
    Given User is on confirm deletion form
    When user clicks on Yes button
    Then user can see successful deletion message

  Scenario: Cancel delete action
    Given User is on confirm deletion form
    When user clicks on No button
    Then user can see batches ares still selected

  Scenario Outline: Verify deleted batches
    Given User is on website
    When user searches for "<deleted>" batches
    Then user should see zero results

    Examples: 
      | deleted |
      | 00004!! |

  Scenario: Add a new Batch
    Given User is on website
    When user clicks on Add a new Batch button
    Then User lands on Batch Details form

  Scenario: Empty form submission for add a new batch
    Given User is on Batch details page
    When user clicks on save button without entering any data
    Then user gets error message

  Scenario: Cancel add batch action
    Given User is on Batch details page
    When user clicks on cancel button
    Then batch details form disappears

  Scenario Outline: Verify details entered in add batch form are visible to user
    Given User is on Batch details page
    When User enters "<Name>", "<Description>", "<ProgramName>", "<NoOfClasses>"
    Then User can see updated values of all fields

    Examples: 
      | Name   | Description | ProgramName | NoOfClasses |
      | SDET01 | Testing     | Software    |          10 |

  Scenario: Save add batch changes
    Given User is on Batch details page
    When user clicks on save button
    Then user can see successful alert

  Scenario Outline: Verify add new batch details
    Given User is on website
    When user searches with newly updated batch "<Name>"
    Then User can see updated values of all fields

    Examples: 
      | Name   |
      | SDET01 |

  Scenario: Verify previous link on first page
    Given User is on website
    When user is on first page of manage batch page
    Then previous link is disabled

  Scenario: Verify next link
    Given user is on page one of manage batch page
    When user clicks navigate next button
    Then user is navigated to page number two

  Scenario: Verify previous link
    Given user is on page two of manage batch page
    When user clicks navigate previous button
    Then user is navigated to page number one
    
	Scenario: Verify next link on last page
    Given User is on website
    When user is on last page of manage batch page
    Then next pagination link is disabled