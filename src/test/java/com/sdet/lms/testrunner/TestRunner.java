package com.sdet.lms.testrunner;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions( 
		features = {"src/test/resources/feature/User.feature"},
		glue = { "com.sdet.lms.stepdefinition" },
				tags = "not @runit",
		plugin = { "pretty", "html:target/LmsBdd.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
		monochrome = true)
@CucumberOptions( 
		features = {"src/test/resources/feature/Programs/"},
		glue = { "com.sdet.lms.stepdefinition" },
				tags = "not @runit",
		plugin = { "pretty", "html:target/LmsBdd.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
		monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

	 @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }	

}