package Runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/kesava/git/My-Cucumber/CucumberFramework/src/main/java/Features/Hashmap.feature", glue = {
		"StepDefinitionfile" }, format = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"json:json_output/cucumber.json" }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {

}
