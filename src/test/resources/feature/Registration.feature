Feature: LMS Registration Page heading

  @sanity
  Scenario: Validating the heading of the Registration form
    Given user is on LMS website
    When user lands on Registration page
    Then User should see the heading of the Registration form

  @sanity
  Scenario: Validating the login button visibility
    Given user is on LMS website
    When user is on the Registration page
    Then user should see the Login button

  @sanity
  Scenario: Validating the login button functionality
    Given user is on Registration page
    When user clicks Login button
    Then user should land in Login page

  @sanity
  Scenario: Validating the Sign Up button visibility
    Given user is on LMS website
    When user lands on Registration page
    Then user should see the Sign Up button on the Form

  @sanity
  Scenario: user fills the First Name field
    Given user is on the Registeration Page
    When user fills the First Name in Alphabets only
    Then The First Name will be displayed

  @sanity
  Scenario: user fills the Last Name field
    Given user is on the Registeration Page
    When user fills the Last Name in Alphabets only
    Then The Last Name will be displayed

  @sanity
  Scenario: user fills the Address field
    Given user is on the Registeration Page
    When user fills the Address Field using Alpha Numerics and or Symbols
    Then The Address will be displayed

  @sanity
  Scenario: user fills the Street Name Field
    Given user is on the Registeration Page
    When User fills the Street name Field using Alpha Numerics and or Symbols
    Then The Street Name will be displayed

  @sanity
  Scenario: user fills the House Number Field
    Given user is on the Registeration Page
    When user fills the House Number field using Alpha Numerics and or Symbols
    Then The House Number will be displayed

  @sanity
  Scenario: User fills the Zip field
    Given user is on the Registeration Page
    When User fills the 5 digit Zip code using Numbers only
    Then The Zip code will be displayed

  @sanity
  Scenario: User fills the City Name field
    Given user is on the Registeration Page
    When User fills the City Name in Alphabets only
    Then The City Name will be displayed

  @sanity
  Scenario: User selects the State field
    Given user is on the Registeration Page
    When user selects the respective State Name from the DropBox
    Then The State Name will be displayed

  Scenario: user fills the Phone Number
    Given user is on the Registeration Page
    When user fills the valid 10 digit Mobile number in Numerics
    Then The Mobile Number will be displayed

  @sanity
  Scenario: user selects the Birth Date
    Given user is on the Registeration Page
    When user Selects the Date of Birth from the Calender
    Then Birth Date will be Displayed

  @sanity
  Scenario: User fills UserName
    Given user is on the Registeration Page
    When user fills the valid unique UserName
    Then UserName will be displayed

  @sanity
  Scenario: user fills Password
    Given user is on the Registeration Page
    When user fills the valid Password with 1 Upper case 1 Numeric and 1 special charecter and 8 charecters
    Then user Password will  be displayed

  @sanity
  Scenario: Validating the Sign Up form with all fields empty
    Given user is on the Registeration Page
    When user enters submit button with all fields empty
    Then user should get a message Please fill all fields above

  @sanity
  Scenario: Validating the First Name field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid First Name
    Then User should get a message Please fill valid First Name

  @sanity
  Scenario: Validating the Last Name field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid Last Name
    Then user should get a message Please fill valid Last Name

  @sanity
  Scenario: Validating the Address field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid Address
    Then user should get a message Please fill valid Address

  @sanity
  Scenario: Validating the Street Name field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid Street Name
    Then user should get a message Please fill valid Street Name

  @sanity
  Scenario: Validating the House Number field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid House Number
    Then user should get a message Please fill valid House Number

  @sanity
  Scenario: Validating the Zip field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid Zip
    Then user should get a message Please fill valid Zip

  @sanity
  Scenario: Validating the City field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid  City
    Then user should get a message Please fill valid City

  @sanity
  Scenario: Validating the State field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button without selecting  State
    Then user should get a message Please select State

  @sanity
  Scenario: Validating the BirthDate field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button without selecting BirthDate
    Then user should get a message Please select BirthDate

  @sanity
  Scenario: Validating the UserName field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid UserName
    Then user should get a message Please fill valid UserName

  @sanity
  Scenario: Validating the Password field on Registeration Page
    Given user is on the Registeration Page
    When user clicks Sign Up button with invalid Password
    Then user should get a message Please fill valid Password

  @sanity
  Scenario: Validating the signup form with existing Username
    Given user is on the Registeration Page
    When uSer clicks Sign Up button with existing User name
    Then user should see the message Username already exist

  @sanity
  Scenario: Validating Sign Up form with valid data
    Given user is on the Registeration Page
    When user enters all Field value and click Sign Up button.
    Then user should get a message Registeration successful
