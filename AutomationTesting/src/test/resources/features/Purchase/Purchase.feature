@All @Purchase
Feature: Purchase demoblaze.com
  Background:
    Given user is already on the Home page of demoblaze.com
    When user click on the Login menu in the Navbar on the Home page of demoblaze.com
    And user input the username "<usernameParam>"
    And user input the password "<passwordParam>"
    And user click the Login button
    Then user successfully logs in and their username are displayed in the Navbar
    And user select to phone categories
    And user select phone product
    And user click Add to Cart button
    And user click Cart submenu
    And user click button place order
  Scenario: Filled all field on the form place order with valid data
    Given user already to Form Place Order
    When user input Name field "<nameVariable>"
    And user input Country field "<counrtyVaribale>"
    And user input City field "<cityVariable>"
    And user input Credit Card  field "<creditCardVariable>"
    And user input Month field "<monthVariable>"
    And user input Year field "<yearVariable>"
    Then user click Purchase button
    And user success submit display information total amount

