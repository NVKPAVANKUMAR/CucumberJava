@LoginProfile

Feature: Guru99 Demopage Login
  To Login in Demopage we have to enter login details

  Scenario: Register On Guru99 Demopage without email
    Given I am on the Guru99 Demopage
    When enter blank details for Registration
    Then error message shown

  Scenario:  Register On Guru99 Demopage with email
    Given I am on the Guru99 Demopage
    When enter valid emailid details for Registration
    Then login details shown

