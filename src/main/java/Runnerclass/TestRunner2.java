package Runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/kesava/git/My-Cucumber/CucumberFramework/src/main/java/Features/hooks.feature", glue = {
		"StepDefinitionfile" }, format = { "pretty",
				"html:test-outout1", }, monochrome = true, strict = true, dryRun = true)

public class TestRunner2 {

}

// tags = { "~@SmokeTest",
// "~@RegressionTest", "~@End2End" }