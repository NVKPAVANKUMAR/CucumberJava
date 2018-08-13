package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static driver.BrowserInstance.closeBrowser;
import static utilities.ReportGenerator.endReport;
import static utilities.ReportGenerator.startReport;

public class Hooks {

    @Before
    public void openBrowser() {
        startReport();
    }

    @After
    public void tearDown() {
        endReport();
        closeBrowser();
    }
}
