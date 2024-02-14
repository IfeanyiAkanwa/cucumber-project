#Author
#Description

Feature: feature to test login fuctionality

  @SmokeTest
  Scenario: Check login is successful with valid Credentials
    Given user is on login page
    When user inputs valid username and password
    And clicks on login button
    Then user is navigated to home page

