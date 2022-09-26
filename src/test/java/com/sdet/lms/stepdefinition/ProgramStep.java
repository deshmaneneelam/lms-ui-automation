package com.sdet.lms.stepdefinition;


import java.time.Duration;

import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.sdet.lms.pageobjects.Program;
import com.sdet.lms.utilities.ContextUI;
import com.sdet.lms.utilities.Util;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramStep {

	ContextUI context;
	Program programPage;
	NgWebDriver ngDriver;
	
	public ProgramStep(ContextUI c) {
		this.context = c;
		programPage = context.getPageObjectManager().getProgramPage();
		ngDriver = context.getNgWebDriver();
	}
	

	@When("User is on Program page")
	public void user_is_on_program_page() {
		System.out.println("Step #2");
	}

	@Then("User should see a heading Manage Program")
	public void user_should_see_a_heading_manage_program() {
		System.out.println("Step #3");
		//programPage = new Program(getDriver());
		String title = programPage.verifyHomePageTitle();
		Assert.assertEquals(Util.TITLE, title);
	}
	
	
		
	@Then("User should see the footer as in total there are z programs")
	public void user_should_see_the_footer_as_in_total_there_are_z_programs() {
		//programPage = new Program(driver);
		String totalCountString = programPage.getTotalPagesString();
		String expCountStr = Util.IN_TOTAL_STR1 + programPage.getTotalEntries() + Util.IN_TOTAL_STR2;
		Assert.assertEquals(totalCountString, expCountStr);
	}
	
	
	
	@Then("User should see the Delete button on the top left hand side as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		//programPage = new Program(driver);
		System.out.println(programPage.isDisabled());
	}
	
	
	
	@Then("Verify that number of records displayed")
	public void verify_that_number_of_records_displayed() {
	    System.out.println("Passed");
	}
	
	
	
	@Then("Text box used for search has text as search")
	public void text_box_used_for_search_has_text_as_search() {
	    //programPage = new Program(driver);
	    Assert.assertEquals(programPage.searchBoxText(),Util.SEARCH_TEXT);
	}
	
	
	
	@When("^User enters (.*) into search box$")
	public void user_enters_text_into_search_box(String searchPhrase) {
		System.out.println("searchPhrase::"+searchPhrase);	  
	    programPage.getSearchElement().sendKeys(searchPhrase);
	    ngDriver.waitForAngularRequestsToFinish();
	}
	
	@Then("^Entries for (.*) in (.*) are shown$")
	public void entries_for_text_in_text_are_shown(String searchPhrase,String columnName) {
		
		System.out.println( columnName.substring( 1, columnName.length() - 1 ) );
		columnName = columnName.substring( 1, columnName.length() - 1 );
		ngDriver.waitForAngularRequestsToFinish();
		
		List<WebElement> rows = programPage.getTbody();
		
		System.out.println("row count::"+rows.size()+"Column type:: "+columnName);
		
		int totalCount = rows.size();
		if(totalCount == 0) {
			System.out.println("No Records");
		}else {
			for(int i=0;i<totalCount;i++) {
				String col=null ;
				if(columnName.equalsIgnoreCase("nameColumn")) {
					System.out.println("columnName::"+columnName);
					System.out.println("Get text::"+rows.get(i).findElement(By.xpath("//td[2]")).getText());
					col = rows.get(i).findElement(By.xpath("//td[2]")).getText();
				} else if(columnName.equalsIgnoreCase("descColumn")) {
					col = rows.get(i).findElement(By.xpath("//td[3]")).getText();
				} else if(columnName.equalsIgnoreCase("actionColumn")) {
					col = rows.get(i).findElement(By.xpath("//td[4]")).getText();
				}
				System.out.println(col);
				System.out.println(searchPhrase);
				if(col.contains(searchPhrase)) {
					System.out.println("Search::"+col);
				}
		   }
	   }
	}
	
	@When("User clicks A New Program button")
	public void user_clicks_a_new_program_button() {
		//programPage = new Program(driver);
		programPage.addProgram();
		
	}

	
	//@After
	public void close() {
		System.out.println("In close");
		//context.getDriver().quit();
	}
	
	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() {
		programPage.selectProgram();

	}

	@Then("Program gets selected")
	public void program_gets_selected() {
		programPage.isChecked();
	}
	
	@Given("User is on Program page after login")
	public void user_is_on_program_page_after_login() {
	   
	}

	@When("User clicks on edit button")
	public void user_clicks_on_edit_button() {
		JavascriptExecutor js = (JavascriptExecutor) context.getDriver(); 
		WebElement myelement = programPage.clickEdit();
		js.executeScript("arguments[0].click()", myelement);
	}
	
	@Then("User lands on Program Details form")
	public void user_lands_on_program_details_form() {
		System.out.println("*****get popup****");
				
		//programPage.getPopupScreen();
	}
	
	@When("User clicks on {string} Delete button")
	public void user_clicks_on_text_delete_button(String type) {
		System.out.println("type::"+type);
		if(type.equalsIgnoreCase("multiple")) {
			System.out.println("Multiple");
			JavascriptExecutor js = (JavascriptExecutor) context.getDriver(); 
			WebElement myelement = programPage.getMultipleCheckBox();
			js.executeScript("arguments[0].click()", myelement);
			programPage.clickMultipleDelete();
		}else if(type.equalsIgnoreCase("single row")) {
			System.out.println("Single row");
			programPage.selectProgram();
			programPage.clickSingleDelBtn();
		}
		
		
	}
	
	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
		String c = programPage.confirmDeleteAlert();
	    System.out.println("delete text::"+c);
	    Assert.assertEquals(c, Util.CONFIRM_ALERT);
	}
	
	@Given("User is on {string} Confirm Deletion form")
	public void user_is_on_text_confirm_deletion_form(String type) {
		user_clicks_on_text_delete_button(type);
		/*//user_clicks_on_delete_button();
		programPage.selectProgram();
		programPage.clickMultipleDelete();*/
	}

	@When("User clicks no button")
	public void user_clicks_no_button() {
		//programPage.clickNoBtn();
	}

	@Then("User can see confirm deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {	
		programPage.isExist().isDisplayed();
	    System.out.println("delete text::"+programPage.isExist().isDisplayed());
	}
	
	@When("User clicks Yes button")
	public void user_clicks_yes_button() {
		programPage.clickYesBtn();
	}

	@Then("User can see success message")
	public void user_can_see_success_message() {
		ngDriver.waitForAngularRequestsToFinish();
		String str = programPage.checkSuccessMsg();
		Assert.assertEquals(str, Util.SUCCESS_STR);
	}
	
	@When("User selects more than one Program using checkbox")
	public void user_selects_more_than_one_program_using_checkbox() {
		JavascriptExecutor js = (JavascriptExecutor) context.getDriver(); 
		WebElement myelement = programPage.getMultipleCheckBox();
		js.executeScript("arguments[0].click()", myelement);
	}

	@Then("All programs are shown selected")
	public void all_programs_are_shown_selected() {
	    By checkedBoxes = programPage.areBoxesChecked();
	    
		List<WebElement> element = new WebDriverWait(context.getDriver(), Duration.ofSeconds(50))
		        .until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkedBoxes));
		
		System.out.println("check::"+element.size());
		for(int i=0;i<element.size();i++) {
			String c = element.get(i).getAttribute("class");
			System.out.println("row " + i +": "+ c);
			if(c.contains(Util.CHECK_HIGHLIGHT)) {
				System.out.println("class"+c);
			}else {
				Assert.assertEquals(c, Util.CHECK_HIGHLIGHT);
			}
		}
	}
}
