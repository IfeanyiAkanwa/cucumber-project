Feature: feature to test google search functionlity

@googleTest
  Scenario: Validate the google search is working
    Given browser is open
    And User is on google search page
    When User enters a text in search box
    And hits enter
    And user is navigated to search result
    Then close driver
