package Runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F://code//Cucumber-FrameWork//src//main//java//Features//nopcommerce.feature", glue = {
		"StepDefinitionfile" }, format = { "pretty",
				"html:test-outout1", }, monochrome = true, strict = true, dryRun = false)

public class TestRunner2 {

}

// tags = { "~@SmokeTest",
// "~@RegressionTest", "~@End2End" }