# author
# date
#

@SmokeScenario
Feature: feature to test login functionality
@SmokeTest
  Scenario: Check login is successful with valid credential
    Given user is on login page
    When user enters username and password
    And clicks on logi button
    Then user is navigated to the home page
