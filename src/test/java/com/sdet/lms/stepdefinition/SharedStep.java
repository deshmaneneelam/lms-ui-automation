package com.sdet.lms.stepdefinition;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.pageobjects.Program;
import com.sdet.lms.pageobjects.User;
import com.sdet.lms.utilities.BaseClass;
import com.sdet.lms.utilities.ContextUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class SharedStep {
	
	
	ContextUI context;
	Program programPage;
	User user;
	Login login;
	
	public SharedStep(ContextUI c) {		
		this.context = c;
	}
	
	@Before("not @sanity")
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
	
	@Given("User is on User page after Login")
	public void user_is_on_user_page_after_login()  {
		user=context.getPageObjectManager().getUserPage();	
		user.clickUserTab();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
