Feature: Test login functionality

  Scenario: Check login is successful with valid credential
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page
