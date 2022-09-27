package com.sdet.lms.stepdefinition;

import org.testng.Assert;

import com.sdet.lms.pageobjects.HomePage;
import com.sdet.lms.utilities.ContextUI;
import com.sdet.lms.utilities.Util;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {

	ContextUI context;
	HomePage homePage;

	public HomePageStep(ContextUI c) {
		this.context = c;
		homePage = context.getPageObjectManager().getHomePage();
	}

	@When("user lands on the home page")
	public void user_lands_on_the_home_page() {
		System.out.println("User is on the home page");

	}

	@Then("verify the title of the Home page")
	public void verify_the_title_of_the_home_page() {
		String homepageTitle = homePage.verifyhomePageTitle();
		Assert.assertEquals(Util.TITLE, homepageTitle);
	}

	@Then("verify the heading of home page")
	public void verify_the_heading_of_home_page() {
		String homepageHeading = homePage.verifyhomepageHeading();
		Assert.assertEquals(Util.HOME_PAGE_HEADING, homepageHeading);

	}

	@Then("user is able to verify the button visibility and text of all menu bar items")
	public void user_is_able_to_verify_the_button_visibility_of_all_menu_bar_items() {
		Assert.assertEquals(homePage.verifyprogramBtn(), true);
		Assert.assertEquals(homePage.verifybatchBtn(), true);
		Assert.assertEquals(homePage.verifyuserBtn(), true);
		Assert.assertEquals(homePage.verifyassignmentBtn(), true);
		Assert.assertEquals(homePage.verifyattendanceBtn(), true);
		Assert.assertEquals(homePage.verifylogoutBtn(), true);
		String ProgramBtn = homePage.verifyprogramBtnText();
		Assert.assertEquals(Util.PROGRAM_BTN, ProgramBtn);
		String BatchBtn = homePage.verifybatchBtnText();
		Assert.assertEquals(Util.BATCH_BTN, BatchBtn);
		String UserBtn = homePage.verifyuserBtnText();
		Assert.assertEquals(Util.USER_BTN, UserBtn);
		String AssignmentBtn = homePage.verifyassignmentBtnText();
		Assert.assertEquals(Util.ASSIGNMENT_BTN, AssignmentBtn);
		String AttendanceBtn = homePage.verifyattendanceBtnText();
		Assert.assertEquals(Util.ATTENDANCE_BTN, AttendanceBtn);
		String LogoutBtn = homePage.verifylogoutBtnText();
		Assert.assertEquals(Util.LOGOUT_BTN, LogoutBtn);
	}

}
