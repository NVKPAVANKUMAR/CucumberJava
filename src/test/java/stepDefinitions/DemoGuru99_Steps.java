package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BrowserInstance;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.DemoGuru99Page;
import utilities.ConfigParser;

import java.io.IOException;

import static driver.BrowserInstance.openUrl;
import static utilities.ReportGenerator.startTest;

public class DemoGuru99_Steps {

    public WebDriver driver;
    private PageObjectManager pageObjectManager;
    private DemoGuru99Page demoGuru99Page;
    private BrowserInstance browserInstance;

    @Given("^I am on the Guru99 Demopage$")
    public void iAmOnTheGuru_Demopage() throws IOException {
        browserInstance = new BrowserInstance();
        driver = browserInstance.initiateDriver("chrome");
        pageObjectManager = new PageObjectManager(driver);
        demoGuru99Page = pageObjectManager.getDemoGuru99Page();
        openUrl(ConfigParser.fetchProperity("guru99url").toString());
        startTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @When("^enter blank details for Registration$")
    public void enterBlankDetailsForRegistration() {
        demoGuru99Page.enterEmailId("");
        demoGuru99Page.clickOnLoginButton();
    }

    @Then("^error message shown$")
    public void errorMessageShown() {
        assert demoGuru99Page.isErrorMsgDisplayed() == true;
    }
}
