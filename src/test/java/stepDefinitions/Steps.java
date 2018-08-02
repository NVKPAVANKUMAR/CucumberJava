package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BrowserInstance;
import managers.PageObjectManager;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigParser;

import java.io.IOException;

import static utilities.ReportGenerator.*;

public class Steps extends BrowserInstance {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private PageObjectManager pageObjectManager;

    @Before
    public void Login_Logout_Functionality() throws IOException {
        startReport();
        initiateDriver(ConfigParser.fetchProperity("browser").toString());
        openUrl(ConfigParser.fetchProperity("testurl").toString());
        pageObjectManager = new PageObjectManager(driver);
        loginPage = pageObjectManager.getHomePage();
        dashboardPage = pageObjectManager.getDashboardPage();
        startTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
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
        dashboardPage.waitForAddNewButton(driver, logger);
        dashboardPage.clickLogout(logger);
    }

    @Then("^Navigates to Login page Again$")
    public void clicksOnLogoutButtonAndNavigatesToLoginPageAgain()  {
        assert loginPage.status_LoginButton(logger) == true;
       logger.pass("Login N Logout Functionality Passed");
    }

    @After
    public void tearDown() {
        endReport();
        driver.quit();
    }



}
