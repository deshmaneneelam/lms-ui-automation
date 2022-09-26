Feature: Delete Program

# Scenario: Validating the default state of Delete button
 #   Given User is logged on to LMS website
 #   When User is on Program page
 #   Then User should see the Delete button on the top left hand side as Disabled
 
 Scenario: Select Program
   Given User is on Program page
   When User selects Program using checkbox
   Then Program gets selected
  
 #  Scenario: Delete Feature
 #  Given User is on Program page
 #  When User clicks on 'single row' Delete button
 #  Then User lands on Confirm Deletion form.
   
 # Scenario: Click No
 # Given User is on 'single row' Confirm Deletion form
 # When User clicks no button
 # Then User can see confirm deletion form disappears
  
 # Scenario: Click Yes
 # Given User is on 'single row' Confirm Deletion form
 # When User clicks Yes button
 # Then User can see success message