package com.sdet.lms.stepdefinition;

import java.time.Duration;

import org.testng.Assert;

import com.sdet.lms.pageobjects.User;
import com.sdet.lms.utilities.ContextUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep {
	
	ContextUI context;
	User user;
	
	public UserStep(ContextUI c) {
		this.context = c;
	    user = context.getPageObjectManager().getUserPage();
	}

	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		System.out.println("*******************welcome");
		
	}

	@When("User clicks the Tab User")
	public void user_clicks_the_tab_user() {
		//User user=new User(driver);
		user.clickUserTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.scrolldown();
		
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
	System.out.println("Driver "+context.getDriver().getTitle());
			
			
	}

@Then("User should see the pagination controls below data table Tc002")
public void user_should_see_the_pagination_controls_below_data_table_tc002() { 
	//User user=new User(driver);
	
	if (user.checkPagination().contains("Showing"))
	{
		System.out.println("we are able to see the pagination");
	}
	else {
		System.out.println("we are not able to see the pagination");
	}
		
    user.scrolldown();
    context.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@When("Manage user table has less  than or equal to 5 rows")
public void manage_user_table_has_less_less_than_or_equal_to_5_rows() {
	//User user=new User(driver);
	
	if(user.pageCount().contains("4"))
	{
		System.out.println("User is less then 5 record");
	}
	else {
		System.out.println("User is more then 5 record");
		user.scrolldown();
	}
	 context.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@Then("Pagination control should be disabled")
public void pagination_control_should_be_disabled() {
   	//User user=new User(driver);
	
		System.out.println("Pagination control is Disabled");
		Assert.assertEquals((boolean)user.checkEnabled(), true);
		
	
	
}


@When("Manage user table has more than 5 rows")
public void manage_user_table_has_more_than_5_rows()  {
	//User user=new User(driver);
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
	//User user=new User(driver);
	
	Assert.assertEquals((boolean)user.checkEnabled(),true );
	user.scrolldown();
	System.out.println("Pagination control is enabled");
   
}

@When("User cliks next link of pagination")
public void user_cliks_next_link_of_pagination() {
	//User user=new User(driver);
	Assert.assertEquals((boolean)user.checkNextPage(),true);
    
}

@Then("Next page should be displayed")
public void next_page_should_be_displayed()  {
	System.out.println("Pagination Control is disabled ");
   
}

@Then("User should see the text  Showing Records Entries")
public void user_should_see_the_text_showing_records_entries()  {
	//User user=new User(driver);
	user.scrolldown();
	user.captureShowing1to4();
	System.out.println("User is able to see Showing 1 to 4 of 4  :" +user.captureShowing1to4());
   
}

@Then("User should see the table footer as In total there are 4 users.")
public void user_should_see_the_table_footer_as_in_total_there_are_4_users()  {
	//User user=new User(driver);
	System.out.println("User is able to see: "+user.pageCount());
   
}

/************** Adding user record********************************/


@Then("User should see the button with text + icon and Add New User")
public void user_should_see_the_button_with_text_icon_and_add_new_user()  {
    //User user=new User(driver);
   System.out.println("User able to see Button with follwing text" +user.addNewUser());
}

@When("User clicks Add New User button")
public void user_clicks_add_new_user_button()  {
	//User user=new User(driver);
	user.clickAddUser();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}

@Then("User should see the User details dialog box")
public void user_should_see_the_user_details_dialog_box()  {
	//User user=new User(driver);
	
	System.out.println("User see the"+user.captureUserDetail());
   
}


@Then("User should see the delete icon at the top left corner of the user table")
public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table()  {
	//User user=new User(driver);
	Assert.assertEquals(user.deleteBtn(),false);
    
}

@When("no rows is checked")
public void no_rows_is_checked()  {
	//User user=new User(driver);
	Assert.assertEquals(user.checkBoxSelect(),false);
    
}

@Then("Delete icon at the top left corner of the user table disabled")
public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
	//User user=new User(driver);
	Assert.assertEquals(user.deleteBtn(),false);
}

@When("User checks the rows in user table")
public void user_checks_the_rows_in_user_table()  {
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

@Then("Delete icon at the top left corner of the user table enabled")
public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled()  {
	//User user=new User(driver);
	Assert.assertEquals(user.deleteBtn(),true);
}


/* Scenario: Behaviour of Delete icon when rows checkedone1 */


@Given("User checks the rows in user table1")
public void user_checks_the_rows_in_user_table1(){
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//User user=new User(driver);
	user.clickUserTab();
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
	//User user=new User(driver);
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
	//User user=new User(driver);
	user.confirmDilaogBox();
	System.out.println("User is able to see Cofirm DilogBox"+user.confirmDilaogBox());
}

/*  Scenario: ValidatingConfirm dialog box by selecting No  */

@Given("User is in confirm dialog box after clicking delete icon")
public void user_is_in_confirm_dialog_box_after_clicking_delete_icon()  {
	/*Login login = new Login(driver);
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
	User user=new User(driver);*/
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
	//User user =new User(driver);
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
	//User user =new User(driver);
	//driver.navigate().back();
    
}



@When("User clicks button with text Yes")
public void user_clicks_button_with_text_yes()  {
	user.yesBtn();
    
}

@Then("Selected rows should be deleted and popup should be shown with success message Users deleted")
public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message_users_deleted()  {
   user.getalert();
   System.out.println("******************"+user.getalert());
}

@When("User clicks the close icon")
public void user_clicks_the_close_icon() {
	user.clickCrossSign();
   
}

@Then("Confirm dialog box should be closed")
public void confirm_dialog_box_should_be_closed()  {
   System.out.println("User is on Manage User page "+user.getManagerUser());
}

@When("User clicks ID in any row")
public void user_clicks_id_in_any_row()  {
	user.selectId();
   
}

@Then("User details dialog box displayed with user information")
public void user_details_dialog_box_displayed_with_user_information() {
	System.out.println("User is on User Detail page");
	user.userDetailFormById();
	context.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	 
}

@Then("User should see the buttons with edit and delete icon in each row of Edit and Delete coulmn")
public void user_should_see_the_buttons_with_edit_and_delete_icon_in_each_row_of_edit_and_delete_coulmn()  {
    System.out.println("User is able to see the delete and edit icon:  ");
    user.displayEditDlt();
}

@When("User clicks delete button")
public void user_clicks_delete_button() {
	
	user.dlt();
   
}

@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete")
public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete() {
	System.out.println("Delete : "+user.confirmDltMsg());
	boolean isDeleteTrue = user.confirmDltMsg().contains("Are you sure you want to delete");
	Assert.assertEquals(isDeleteTrue,true);
}

@Then("User should see the search input field with search icon and text as Search")
public void user_should_see_the_search_input_field_with_search_icon_and_text_as_search()  {
    user.searchBtn();
}

@When("User clicks A Add new user button")
public void user_clicks_a_add_new_user_button()  {
	user.clickAddNewUser();
    
}

@Then("User should see a button with text Cancel in user details window")
public void user_should_see_a_button_with_text_cancel_in_user_details_window()  {
	Assert.assertEquals(user.getTextCancelButton(), "Cancel");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Text="+user.getTextCancelButton());
   
}


@When("User clicks A cancel button")
public void user_clicks_a_cancel_button() throws Throwable {
	user.clickAddNewUser();
	user.ClickCancelDlt();;
    
}

@Then("User details window should be closed")
public void user_details_window_should_be_closed(){
	System.out.println("User Page is Close");
}
 
@Then("User should see a cancel\\(x) in user details window")
public void user_should_see_a_cancelx_in_user_details_window()  {
	user.presenceOfCancelBtn();
    
}
}





