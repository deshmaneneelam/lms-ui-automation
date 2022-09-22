package com.sdet.lms.stepdefinition;


import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.utilities.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep extends BaseClass {
	
	Login login=new  Login(driver);

    @Before
	public void setUp() {
    	setup();

    }

    
    @After
    public void clOse() {
    	close();

    }
    
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		
				System.out.println("User is on Browser");
	  
	}

	@When("User opens the LMS Website")
	public void user_opens_the_lms_website() {
		System.out.println("Website is opened ");
	}

	@Then("User should see the Login page.")
	public void user_should_see_the_login_page() {
		
	System.out.println(driver.getTitle());
	   
	}
}
