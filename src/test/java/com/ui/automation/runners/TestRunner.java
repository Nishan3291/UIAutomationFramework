package com.ui.automation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/ui/automation/features",
        glue = {"com.ui.automation.stepDefinitions"},
        plugin = {"pretty","html:target/cucumber-report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
