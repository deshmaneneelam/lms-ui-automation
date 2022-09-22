package com.sdet.lms.stepdefinition;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.utilities.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep extends BaseClass{

	
	 @Before
		public void setUp() {
	    	setup();

	    }
	@After
    public void clOse() {
    	close();

    }
	
	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		System.out.println("*******************"+configReader.getUsername());
		Login login = new Login(driver);
		login.enterUsername(configReader.getUsername());
		login.enterPassword(configReader.getPass());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.loginClick();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
	}

	@When("User clicks the Tab User")
	public void user_clicks_the_tab_user() {
		System.out.println("user on when");
	    
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
		System.out.println("user on then");
	    
	}


}
