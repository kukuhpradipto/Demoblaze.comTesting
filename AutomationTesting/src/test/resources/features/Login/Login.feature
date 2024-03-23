@Login
Feature: Login demoblaze.com
  Scenario: Logging into demoblaze.com Web with a registered account
    Given user is already on the Login page of demoblaze.com
    When user clicks on the Login menu in the Navbar on the Home page of demoblaze.com
    And user enter the username "<usernameParam>"
    And user enter the password "<passwordParam>"
    And user clicks the Login button
    Then user successfully logs in and their username are displayed in the Navbar