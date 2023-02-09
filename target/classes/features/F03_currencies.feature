@smoke
Feature: F03_currencies | user select the currency

  Scenario: user select the currency
    When user clicks on the currencies list
    And user choose Euro currency
    Then all displayed objects prices are in euros