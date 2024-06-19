package TestRun;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { ".//FeatureFile" }, //featurefile folder
glue="StepDefination", //packagename for the step defination
dryRun = false, monochrome = true,
plugin = {
		"pretty", "html:target/Cucumber-report/SearchFlight.html" },

		tags = "cleartrip"

)

//the cucumber file will always be empty

public class TestRunner {

}
