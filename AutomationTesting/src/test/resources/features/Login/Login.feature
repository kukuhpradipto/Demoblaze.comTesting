@All @Login
Feature: Login demoblaze.com
  Scenario: Logging into demoblaze.com Web with a registered account
    Given user is already on the Home page of demoblaze.com
    When user click on the Login menu in the Navbar on the Home page of demoblaze.com
    And user input the username "<usernameParam>"
    And user input the password "<passwordParam>"
    And user click the Login button
    Then user successfully logs in and their username are displayed in the Navbar

  Scenario: Logging into demoblaze.com Web with a registered username and unregistered password
    Given user is already on the Home page of demoblaze.com
    When user click on the Login menu in the Navbar on the Home page of demoblaze.com
    And user input the username "<usernameParam>"
    And user input the unregistered password "<unPasswordParam>"
    And user click the Login button
    Then display pop up information wrong password

  Scenario: Logging into demoblaze.com Web with an unregistered username and registered password
    Given user is already on the Home page of demoblaze.com
    When user click on the Login menu in the Navbar on the Home page of demoblaze.com
    And user input the unregistered username "<unUsernameParam>"
    And user input the password "<passwordParam>"
    And user click the Login button
    Then display pop up information User does not exist





