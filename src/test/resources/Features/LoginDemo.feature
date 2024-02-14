Feature: Test Login functionality

	@loginSample
  Scenario Outline: Check Login is successful with valid Credentials
    Given Open browser
    And user is on login page
    When user enters <username> and <password>
    And click on the login button
    Then user should successfully login

    Examples: 
      | username | password |
      | test     | test     |
   