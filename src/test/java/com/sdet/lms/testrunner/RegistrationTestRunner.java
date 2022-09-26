package com.sdet.lms.testrunner;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions( 
		features = {"src/test/resources/feature/Registration.feature"},
		glue = { "com.sdet.lms.stepdefinition.registration" },
		plugin = { "pretty", "html:target/LmsBdd.html" },
		monochrome = true)
public class RegistrationTestRunner extends AbstractTestNGCucumberTests {

	 @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }	

}