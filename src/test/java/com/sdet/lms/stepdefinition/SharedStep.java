package com.sdet.lms.stepdefinition;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.pageobjects.Program;
import com.sdet.lms.utilities.BaseClass;
import com.sdet.lms.utilities.ContextUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class SharedStep {
	
	
	ContextUI context;
	Program programPage;
	
	public SharedStep(ContextUI c) {		
		this.context = c;
	}
	
	@Before
	public void initiateLoginBeforeEachScenario() {
		Login login = context.getPageObjectManager().getLoginPage();//new Login(context.getDriver());
		login.enterUsername(context.getConfigReader().getUsername());
		login.enterPassword(context.getConfigReader().getPass());
		login.loginClick();
	}
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
	    System.out.println("Step #1");
	}
}
