package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {
        "pretty", "html:target/cucumberHtmlReport",
        "html:target/cucumberHtmlReport",     //  for html result
        "pretty:target/cucumber-json-report.json"   // for json result
},
        features = "src/test/resources/FunctionalTests",
        glue = {"stepDefinitions" // user step definitions package
        })
public class TestRunner {

}
