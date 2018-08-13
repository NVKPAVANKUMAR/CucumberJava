Feature: guru99 Demopage Login
  To Login in Demopage we have to enter login details

  Scenario: Register On Guru99 Demopage without email
    Given I am on the Guru99 Demopage
    When enter blank details for Registration
    Then error message shown