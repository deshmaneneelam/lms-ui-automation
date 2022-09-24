Feature: Validating Manage user page

  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page

  @ignore
  Scenario: Verify the presence of pagination
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page
    Then User should see the pagination controls below data table Tc002

  @ignore
  Scenario: Verify the Pagination control with less Than 5 rows
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page
    When Manage user table has less  than or equal to 5 rows
    Then Pagination control should be disabled

  @ignore
  Scenario: Verify the Pagination control with more than 5 rows
    Given User is on User page after Login
    When Manage user table has more than 5 rows
    Then Pagination control should be enabled

  @ignore
  Scenario: Verify pagination next link
    Given User is on User page after Login
    When User cliks next link of pagination
    Then Next page should be displayed

  @ignore
  Scenario: Verifiy the entry details below data table
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the text  Showing Records Entries

  @ignore
  Scenario: Verify table footer
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the table footer as In total there are 4 users.

  @ignore
  Scenario: Verify the presence of Add new user button
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the button with text + icon and Add New User

  Scenario: Verify the functionality of Add new User button
    Given User is on User page after Login
    When User clicks Add New User button
    Then User should see the User details dialog box

  @ignore
  Scenario: Verify the presence of Delete icon in manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the delete icon at the top left corner of the user table

  @ignore
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
