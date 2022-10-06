package com.sdet.lms.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/Programs", 
glue= {"com.sdet.lms.stepdefinition"},
monochrome=true,
plugin= {"pretty",
		"junit:target/JUnitReports/reports.xml",
		"json:target/jsonReports/report.json",
		"html:target/htmlReport/report.html"}

		)
public class Runner {

}
