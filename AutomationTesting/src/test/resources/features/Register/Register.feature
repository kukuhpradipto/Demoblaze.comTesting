@All @Register
Feature: Register demoblaze.com
  Scenario: Register into demoblaze.com Web with a unregistered username and unregistered password
    Given user is already on the Home page of demoblaze.com
    When user click on the Register menu in the Navbar on the Home page of demoblaze.com
    And user input register with unregistered username"<unUsernameParam>"
    And user input register with unregistered password "<unPasswordParam>"
    And user click the Register button
    Then user successfully register and display pop up Sign up successful.

  Scenario: Register into demoblaze.com Web with a registered username and registered password
    Given user is already on the Home page of demoblaze.com
    When user click on the Register menu in the Navbar on the Home page of demoblaze.com
    And user input the registered username"<usernameParam>"
    And user input the registered password "<passwordParam>"
    And user click the Register button
    Then user can't register and display pop up This user already exist.

  Scenario: Register into demoblaze.com Web with a registered username and unregistered password
    Given user is already on the Home page of demoblaze.com
    When user click on the Register menu in the Navbar on the Home page of demoblaze.com
    And user input the registered username"<usernameParam>"
    And user input register with unregistered password "<unPasswordParam>"
    And user click the Register button
    Then user can't register and display pop up This user already exist.





