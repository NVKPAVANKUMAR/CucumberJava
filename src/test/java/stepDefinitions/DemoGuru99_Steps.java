package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.DemoGuru99Page;
import pages.DemoGuru99_CredentialsPage;
import utilities.ConfigParser;

import java.io.IOException;

import static driver.BrowserInstance.initiateDriver;
import static driver.BrowserInstance.openUrl;

public class DemoGuru99_Steps {

    private WebDriver driver;
    private PageObjectManager pageObjectManager;
    private DemoGuru99Page demoGuru99Page;
    private DemoGuru99_CredentialsPage credentialsPage;

    @Given("^I am on the Guru99 Demopage$")
    public void iAmOnTheGuru_Demopage() throws IOException {
        driver = initiateDriver(ConfigParser.fetchProperity("browser").toString());
        pageObjectManager = new PageObjectManager(driver);
        demoGuru99Page = pageObjectManager.getDemoGuru99Page();
        credentialsPage = pageObjectManager.getDemoGuru99CredentialsPage();
        openUrl(ConfigParser.fetchProperity("guru99url").toString());
        //  startTest("DemoGuru99 Bank Login Functionality");
    }

    @When("^enter blank details for Registration$")
    public void enterBlankDetailsForRegistration() {
        demoGuru99Page.enterEmailId("");
        demoGuru99Page.clickOnLoginButton();
    }

    @Then("^error message shown$")
    public void errorMessageShown() {
        assert demoGuru99Page.isErrorMsgDisplayed();
    }


    @When("^enter valid emailid details for Registration$")
    public void enterValidEmailidDetailsForRegistration() {
        demoGuru99Page.enterEmailId(ConfigParser.fetchProperity("guru99mailid").toString());
        demoGuru99Page.clickOnLoginButton();
    }

    @Then("^login details shown$")
    public void loginDetailsShown() {
        assert credentialsPage.isUserIdDisplayed();
    }


}
