package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue= {"StepDefinitions"},monochrome=true,dryRun=false,
tags= {"@Login"},plugin = {"pretty", "json:target/HTMLReports/HTMLreport"})
public class TestRunner 
{

}
