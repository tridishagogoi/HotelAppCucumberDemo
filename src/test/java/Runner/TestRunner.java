package Runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
glue = "com.stepDefinition", 
plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner {

}
