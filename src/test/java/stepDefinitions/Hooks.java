package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static driver.BrowserInstance.closeBrowser;

public class Hooks {

    @Before
    public void openBrowser() {
    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}
