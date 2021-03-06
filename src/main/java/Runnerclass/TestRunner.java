package Runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:/code//Cucumber-FrameWork//src//main//java//Features//Has.feature", glue = {
		"StepDefinitionfile" }, format = { "pretty", "html:test-outout",
				"json:json_output/cucumber.json", }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {

	// Plugin = {"html:target/Cucumber-html-report" }
}
