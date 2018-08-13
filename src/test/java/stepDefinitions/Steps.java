package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BrowserInstance;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigParser;

import java.io.IOException;

import static driver.BrowserInstance.initiateDriver;
import static driver.BrowserInstance.openUrl;
import static utilities.ReportGenerator.logger;
import static utilities.ReportGenerator.startTest;

public class Steps {
    WebDriver driver;
    DashboardPage dashboardPage;
    LoginPage loginPage;
    PageObjectManager pageObjectManager;

    @Given("^I am on the silverstripe Demopage$")
    public void iAmOnThesilverstripe_Demopage() throws IOException {
        driver = initiateDriver(ConfigParser.fetchProperity("browser").toString());
        pageObjectManager = new PageObjectManager(driver);
        loginPage = pageObjectManager.getHomePage();
        dashboardPage = pageObjectManager.getDashboardPage();
        openUrl(ConfigParser.fetchProperity("testurl").toString());
        startTest("Demosilverstripe -> loginNlogout Functionality");
    }

    @When("^user enters valid username$")
    public void userEntersValidUsername() {
        loginPage.input_Username(ConfigParser.fetchProperity("username").toString(), logger);
    }

    @And("^user enters valid password$")
    public void userEntersValidPassword() {
        loginPage.input_password(ConfigParser.fetchProperity("password").toString(), logger);
    }

    @And("^Clicks on login button$")
    public void clicksOnLoginButton() {
        loginPage.click_LoginButton(logger);
    }

    @Then("^user must be navigated to dashboardpage$")
    public void userMustBeNavigatedToDashboardpage() {
        dashboardPage.waitForAddNewButton(driver);
        dashboardPage.clickLogout();
    }

    @Then("^Navigates to Login page Again$")
    public void clicksOnLogoutButtonAndNavigatesToLoginPageAgain() {
        assert loginPage.status_LoginButton() == true;
        logger.pass("Login & Logout Functionality Success");
    }


}
