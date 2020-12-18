package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"}, monochrome = true,
        // tags = "@SmokeTest",
        plugin = { "pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json",
                "junit:target/cucumber-reports.xml"}
        // plugin = { "pretty", "json:target/cucumber-reports.json" },
        // plugin = { "pretty", "junit:target/cucumber-reports.xml" }
        )
public class TestRunner {
}
