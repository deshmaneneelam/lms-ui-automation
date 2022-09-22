Feature: Validating Manage user page

  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page

  Scenario: Verify the Manage user page heading
    Given User is on any page after Login
    When User is on the Manage user page after clicking User Tab
    Then User should see the page heading as Manage User
