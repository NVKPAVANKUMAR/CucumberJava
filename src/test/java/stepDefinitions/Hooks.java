package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

import static driver.BrowserInstance.closeBrowser;
import static utilities.ReportGenerator.endReport;
import static utilities.ReportGenerator.startReport;

public class Hooks {

    @Before
    public void openBrowser() throws IOException {
        System.out.println("Called openbrowser");
        startReport();
    }

    @After
    public void tearDown() {
        endReport();
        closeBrowser();
    }
}
