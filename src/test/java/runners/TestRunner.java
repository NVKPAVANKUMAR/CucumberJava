package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import org.testng.junit.JUnit4TestRunner;
import utilities.ConfigParser;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FunctionalTests",
        glue = {"stepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true)

public class TestRunner {

    private JUnit4TestRunner jUnit4TestRunner;

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(ConfigParser.fetchProperity("extentreport_xml").toString()));
        Reporter.setSystemInfo("Host Name", "Qualitest");
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", System.getProperty("os.name"));
        Reporter.setSystemInfo("Selenium", "3.4.0");
        Reporter.setSystemInfo("Java Version", System.getProperty("java.runtime.version"));
    }

    @Test(description = "Runs Cucumber Feature")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        jUnit4TestRunner.run(TestRunner.class);
    }
}
