$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End Tests",
  "description": "Description: The purpose of this feature is to test End 2 End Integration",
  "id": "automated-end2end-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14184777229,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User is on Loginpage",
  "description": "",
  "id": "automated-end2end-tests;user-is-on-loginpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user must be navigated to dashboardpage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Navigates to Login page Again",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userEntersValidUsername()"
});
formatter.result({
  "duration": 147489439,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersValidPassword()"
});
formatter.result({
  "duration": 62453707,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicksOnLoginButton()"
});
formatter.result({
  "duration": 3584965190,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userMustBeNavigatedToDashboardpage()"
});
formatter.result({
  "duration": 3089288741,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicksOnLogoutButtonAndNavigatesToLoginPageAgain()"
});
formatter.result({
  "duration": 24481543,
  "status": "passed"
});
formatter.after({
  "duration": 353358774,
  "status": "passed"
});
});