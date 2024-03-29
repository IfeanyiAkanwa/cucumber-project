package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"}, monochrome = true, plugin = {"pretty", "html:target/HtmlReport", "json:target/JSONReport/Report.json", "junit:target/XmlReport/Report.xml"}, tags = "@loginSample")
public class TestRunner {

}
 