package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigParser;

import java.io.IOException;

import static driver.BrowserInstance.initiateDriver;
import static driver.BrowserInstance.openUrl;

public class Steps {
    private WebDriver driver;
    private DashboardPage dashboardPage;
    private LoginPage loginPage;
    private PageObjectManager pageObjectManager;

    @Given("^I am on the silverstripe Demopage$")
    public void iAmOnThesilverstripe_Demopage() throws IOException {
        driver = initiateDriver(ConfigParser.fetchProperity("browser").toString());
        pageObjectManager = new PageObjectManager(driver);
        loginPage = pageObjectManager.getHomePage();
        dashboardPage = pageObjectManager.getDashboardPage();
        openUrl(ConfigParser.fetchProperity("testurl").toString());
        //   startTest("Demosilverstripe -> loginNlogout Functionality");
    }

    @When("^user enters valid username$")
    public void userEntersValidUsername() {
        loginPage.input_Username(ConfigParser.fetchProperity("username").toString());
    }

    @And("^user enters valid password$")
    public void userEntersValidPassword() {
        loginPage.input_password(ConfigParser.fetchProperity("password").toString());
    }

    @And("^Clicks on login button$")
    public void clicksOnLoginButton() {
        loginPage.click_LoginButton();
    }

    @Then("^user must be navigated to dashboardpage$")
    public void userMustBeNavigatedToDashboardpage() {
        dashboardPage.waitForAddNewButton(driver);
        dashboardPage.clickLogout();
    }

    @Then("^Navigates to Login page Again$")
    public void clicksOnLogoutButtonAndNavigatesToLoginPageAgain() {
        assert loginPage.status_LoginButton() == true;
    }


}
