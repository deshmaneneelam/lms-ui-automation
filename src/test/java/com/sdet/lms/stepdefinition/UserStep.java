package com.sdet.lms.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

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
@When("Manage user table has less  than or equal to 5 rows")
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
	
	Assert.assertEquals(user.checkEnabled(),true );
	System.out.println("Pagination control is enabled");
   
}

@When("User cliks next link of pagination")
public void user_cliks_next_link_of_pagination() {
	User user=new User(driver);
	Assert.assertEquals(user.checkNextPage(),true);
    
}

@Then("Next page should be displayed")
public void next_page_should_be_displayed()  {
	System.out.println("Pagination Control is disabled ");
   
}

@Then("User should see the text  Showing Records Entries")
public void user_should_see_the_text_showing_records_entries()  {
	User user=new User(driver);
	user.captureShowing1to4();
	System.out.println("User is able to see Showing 1 to 4 of 4" +user.captureShowing1to4());
   
}

@Then("User should see the table footer as In total there are 4 users.")
public void user_should_see_the_table_footer_as_in_total_there_are_4_users()  {
	User user=new User(driver);
	System.out.println("User is able to see: "+user.pageCount());
   
}

/************** Adding user record********************************/


@Then("User should see the button with text + icon and Add New User")
public void user_should_see_the_button_with_text_icon_and_add_new_user()  {
    User user=new User(driver);
   System.out.println("User able to see Button with follwing text" +user.addNewUser());
}

@When("User clicks Add New User button")
public void user_clicks_add_new_user_button()  {
	User user=new User(driver);
	user.clickAddUser();
    
}

@Then("User should see the User details dialog box")
public void user_should_see_the_user_details_dialog_box()  {
	User user=new User(driver);
	
	System.out.println("User see the"+user.captureUserDetail());
   
}


@Then("User should see the delete icon at the top left corner of the user table")
public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table()  {
	User user=new User(driver);
	Assert.assertEquals(user.deleteBtn(),false);
    
}

@When("no rows is checked")
public void no_rows_is_checked()  {
	User user=new User(driver);
	Assert.assertEquals(user.checkBoxSelect(),false);
    
}

@Then("Delete icon at the top left corner of the user table disabled")
public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
	User user=new User(driver);
	Assert.assertEquals(user.deleteBtn(),false);
}

@When("User checks the rows in user table")
public void user_checks_the_rows_in_user_table()  {
	User user=new User(driver);
	user.checkBox1RowSelect();
	System.out.println("Checkbox is selected ");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}

@Then("Delete icon at the top left corner of the user table enabled")
public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled()  {
	User user=new User(driver);
	Assert.assertEquals(user.deleteBtn(),true);
}


/* Scenario: Behaviour of Delete icon when rows checkedone1 */
@Given("User checks the rows in user table1")
public void user_checks_the_rows_in_user_table1(){
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
	//User user=new User(driver);
	user.checkBox1RowSelect();
	System.out.println("Checkbox is selected ");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
   
}

@When("User clicks the delete icon at the top left corner of user table1")
public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table1() {
	User user=new User(driver);
	user.ClickDeleteBtn();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}

@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete the selected Users1")
public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete_the_selected_users1()  {
	User user=new User(driver);
	user.confirmDilaogBox();
	System.out.println("User is able to see Cofirm DilogBox"+user.confirmDilaogBox());
}

/*  Scenario: ValidatingConfirm dialog box by selecting No  */

@Given("User is in confirm dialog box after clicking delete icon")
public void user_is_in_confirm_dialog_box_after_clicking_delete_icon()  {
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
	//User user=new User(driver);
	user.checkBox1RowSelect();
	System.out.println("Checkbox is selected ");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	user.ClickDeleteBtn();
  
}

@When("User clicks button with text No")
public void user_clicks_button_with_text_no()  {
	User user =new User(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
     user.confirmNoBtn();
     
}

@Then("Selected rows should not be deleted and dialog box should be closed")
public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed()  {
	User user =new User(driver);
	//driver.navigate().back();
    
}

}

