Feature: Validating Manage user page
    @runit
  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page

  Scenario: Verify the presence of pagination
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page
    Then User should see the pagination controls below data table Tc002

     @runit
  Scenario: Verify the Pagination control with less Than 5 rows
    Given User is on User page after Login
    When Manage user table has less  than or equal to 5 rows
    Then Pagination control should be disabled


  Scenario: Verify the Pagination control with more than 5 rows
    Given User is on User page after Login
    When Manage user table has more than 5 rows
    Then Pagination control should be enabled

 
  Scenario: Verify pagination next link
    Given User is on User page after Login
    When User cliks next link of pagination
    Then Next page should be displayed

  
  Scenario: Verifiy the entry details below data table
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the text  Showing Records Entries

 
  Scenario: Verify table footer
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the table footer as In total there are 4 users.

  
  Scenario: Verify the presence of Add new user button
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the button with text + icon and Add New User

 
  Scenario: Verify the functionality of Add new User button
    Given User is on User page after Login
    When User clicks Add New User button
    Then User should see the User details dialog box


  Scenario: Verify the presence of Delete icon in manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the delete icon at the top left corner of the user table


  Scenario: Behaviour of Delete icon when no rows unchecked
    Given User is on User page after Login
    When no rows is checked
    Then Delete icon at the top left corner of the user table disabled


  Scenario: Behaviour of Delete icon when rows checked
    Given User is on User page after Login
    When User checks the rows in user table
    Then Delete icon at the top left corner of the user table enabled


  Scenario: Behaviour of Delete icon when rows checkedone1
    Given User checks the rows in user table1
    When User clicks the delete icon at the top left corner of user table1
    Then Confirm dialog box should be displayed with Text Are you sure you want to delete the selected Users1


  Scenario: ValidatingConfirm dialog box by selecting No
    Given User is in confirm dialog box after clicking delete icon
    When User clicks button with text No
    Then Selected rows should not be deleted and dialog box should be closed


  Scenario: Validating Confirm dialog box by selecting Yes
    Given User is in confirm dialog box after clicking delete icon
    When User clicks button with text Yes
    Then Selected rows should be deleted and popup should be shown with success message Users deleted


  Scenario: Validating Confirm dialog box by clicking close(x) icon
    Given User is in confirm dialog box after clicking delete icon
    When User clicks the close icon
    Then Confirm dialog box should be closed


  Scenario: Verify ID functionality
    Given User is on User page after Login
    When User clicks ID in any row
    Then User details dialog box displayed with user information

  Scenario: Verify the presence of Edit/Delete icon
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the buttons with edit and delete icon in each row of Edit and Delete coulmn

  Scenario: Fucntionality of delete button
    Given User is on User page after Login
    When User clicks delete button
    Then Confirm dialog box should be displayed with Text Are you sure you want to delete

 
  Scenario: Verify the presence of search icon and text in the search input filed
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the search input field with search icon and text as Search
    

    Scenario: Verify the presence of Cancel button in user detais window
    Given User is on User page after Login
    When User clicks A Add new user button
    Then User should see a button with text Cancel in user details window
    
    Scenario: Fucntionality of Cancel icon
     
  
    Scenario: Fucntionality of Cancel button
   Given User is on User page after Login
    When User clicks A cancel button
    Then User details window should be closed
    
       @runit
    Scenario: Verify the presence of Cancel(x) icon in user detais window
    Given User is on User page after Login
    When User clicks A Add new user button
    Then User should see a cancel(x) in user details window
    