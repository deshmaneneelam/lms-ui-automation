package com.sdet.lms.testrunner;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions( 
		features = {"src/test/resources/feature/User.feature",
				"src/test/resources/feature/Programs/Heading.feature",
				"src/test/resources/feature/Programs/Footer.feature",
				"src/test/resources/feature/Batch.feature"},
		glue = { "com.sdet.lms.stepdefinition" },
		
		plugin = { "pretty", "html:target/LmsBdd.html" },
		monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	 @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }	

}