
#@Edge
@Firefox
Feature: User Registration In MecuryFlight Site

  Background: 
    Given I ve' a valid set of data and access to the Registration page

  #DataTable for a single user data set using raw()
  # @UserReg1 @Firefox
  Scenario: Single user registration
    When Registration page is displayed
    Then I enter valid data
      | first_name  | Demo1           |
      | last_name   | Single          |
      | phone       | 347775755       |
      | email       | demo@single.com |
      | username    | Demo1           |
      | password    | demogate        |
      | confirm_pwd | demogate        |
    Then Click on the submit button
    And Thank you for registering: should be displayed
    Then Click on the Signoff Button

  #Using Hash Map in DataTable
  #@UserReg2
  Scenario: Multiple user registration
    When Registration page is displayed
    Then I enter valid data on registration page and verify post-registration
      | first_name | last_name | phone      | email            | username | password  | confirm_pwd |
      | Demo1      | Single1   | 0789644111 | demo1@single.com | Demo1    | demogate  | demogate    |
      | Demo2      | Single2   | 0789644222 | demo2@single.com | Demo2    | demogate1 | demogate1   |
      | Demo3      | Single3   | 0789644333 | demo3@single.com | Demo3    | demogate1 | demogate1   |

  #Using POJO in DataTable
  Scenario: Multiple User Registration using POJO
    When Registration page is displayed
    Then I enter valid data on registration page and check if registration is successfull
      | first_name | last_name | phone      | email            | username | password  | confirm_pwd |
      | Demo1      | Single1   | 0789644111 | demo1@single.com | Demo1    | demogate  | demogate    |
      | Demo2      | Single2   | 0789644222 | demo2@single.com | Demo2    | demogate1 | demogate1   |
      | Demo3      | Single3   | 0789644333 | demo3@single.com | Demo3    | demogate1 | demogate1   |
