Feature: Complete Registration Form
  As a customer
  I want to complete my registration
  So that I can login to the flight application

  Scenario: Fill out registration with multiple rows of data
    Given I am on mecury flight site
    And I click on the regitration page
    Then I enter my information
      | firstname | lastname | phone      | email        | username | password | confirmpassword |
      | Aditya    | Roy      | 7501451187 | a@text.com   | aditya91 | test123  | test123         |
      | Rakesh    | Sinha    | 7589866698 | b@rars.com   | rakesh90 | test123  | test123         |
      | Preety    | Sharma   | 8598745805 | preety@t.com | preety18 | test123  | test123         |
    Then Click on Signoff