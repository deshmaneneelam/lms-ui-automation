package com.sdet.lms.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.pageobjects.User;
import com.sdet.lms.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep extends BaseClass{

	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		System.out.println("*******************"+configReader.getUsername());
		Login login = new Login(driver);
		login.enterUsername(configReader.getUsername());
		login.enterPassword(configReader.getPass());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.loginClick();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	@When("User clicks the Tab User")
	public void user_clicks_the_tab_user() {
		User user=new User(driver);
		user.clickUserTab();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
		System.out.println("user on then");
	    
	}
	
	
	 
@Given("User is on any page after Tc002")
public void user_is_on_any_page_after_tc002() { 
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Driver "+driver.getTitle());
			
			
	}

@Then("User should see the pagination controls below data table Tc002")
public void user_should_see_the_pagination_controls_below_data_table_tc002() { 
	User user=new User(driver);
	
	if (user.checkPagination().contains("Showing"))
	{
		System.out.println("we are able to see the pagination");
	}
	else {
		System.out.println("we are not able to see the pagination");
	}
		

}
@When("Manage user table has less less than or equal to 5 rows")
public void manage_user_table_has_less_less_than_or_equal_to_5_rows() {
	User user=new User(driver);
	if(user.pageCount().contains("4"))
	{
		System.out.println("User is less then 5 record");
	}
	else {
		System.out.println("User is more then 5 record");
	}
	
}

@Then("Pagination control should be disabled")
public void pagination_control_should_be_disabled() {
   	User user=new User(driver);
	
		System.out.println("Pagination control is Disabled");
		Assert.assertEquals(user.checkEnabled(), true);
	
	
}


@Given("User is on User page after Login")
public void user_is_on_user_page_after_login()  {
	Login login = new Login(driver);
	login.enterUsername(configReader.getUsername());
	login.enterPassword(configReader.getPass());
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	login.loginClick();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	User user=new User(driver);
	user.clickUserTab();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("YOU are on scenario 4");
	
}

@When("Manage user table has more than 5 rows")
public void manage_user_table_has_more_than_5_rows()  {
	User user=new User(driver);
	if(user.pageCount().contains("5"))
	{
		System.out.println("User is 5 record and more than 5");
	}
	else {
		System.out.println("User is less then 5 record");
	}
    
}

@Then("Pagination control should be enabled")
public void pagination_control_should_be_enabled()  {
	User user=new User(driver);
	
	Assert.assertEquals(user.checkEnabled(), false);
	System.out.println("Pagination control is enabled");
   
}

}

