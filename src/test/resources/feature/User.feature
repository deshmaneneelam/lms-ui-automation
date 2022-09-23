Feature: Validating Manage user page

  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page

  Scenario: Verify the presence of pagination
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page
    Then User should see the pagination controls below data table Tc002

  Scenario: Verify the Pagination control with less Than 5 rows
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page
    When Manage user table has less less than or equal to 5 rows
    Then Pagination control should be disabled

  Scenario: Verify the Pagination control with more than 5 rows
    Given User is on User page after Login
    When Manage user table has more than 5 rows
    Then Pagination control should be enabled