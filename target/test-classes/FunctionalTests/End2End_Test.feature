Feature: Automated End2End Tests
  Description: The purpose of this feature is to test End 2 End Integration

  Scenario: User is on Loginpage
    When user enters valid username
    And user enters valid password
    And Clicks on login button
    Then user must be navigated to dashboardpage
    Then Navigates to Login page Again