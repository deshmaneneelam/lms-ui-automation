package com.sdet.lms.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	JavascriptExecutor js;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Program')]")
	WebElement ProgramBtn;

	@FindBy(xpath = "//span[contains(text(),' LMS - Learning Management System ')]")
	WebElement pageHeading;

	@FindBy(xpath = "//span[text()='Batch']")
	WebElement batchBtn;

	@FindBy(xpath = "//span[text()='User']")
	WebElement userBtn;

	@FindBy(xpath = "//span[text()='Assignment']")
	WebElement assignmentBtn;

	@FindBy(xpath = "//span[text()='Attendance']")
	WebElement attendanceBtn;

	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logoutBtn;

	public String verifyhomePageTitle() {
		return driver.getTitle();
	}

	public String verifyhomepageHeading() {
		return pageHeading.getText();
	}

	public boolean verifyprogramBtn() {
		return ProgramBtn.isDisplayed();
	}

	public boolean verifybatchBtn() {
		return batchBtn.isDisplayed();
	}

	public boolean verifyuserBtn() {
		return userBtn.isDisplayed();
	}

	public boolean verifyassignmentBtn() {
		return assignmentBtn.isDisplayed();
	}

	public boolean verifyattendanceBtn() {
		return attendanceBtn.isDisplayed();
	}

	public boolean verifylogoutBtn() {
		return logoutBtn.isDisplayed();
	}

	public String verifyprogramBtnText() {
		System.out.println("ProgramBtn text is: " + ProgramBtn.getText());
		return ProgramBtn.getText();
	}

	public String verifybatchBtnText() {
		System.out.println("BatchBtn text is: " + batchBtn.getText());
		return batchBtn.getText();
	}

	public String verifyuserBtnText() {
		System.out.println("UserBtn text is: " + userBtn.getText());
		return userBtn.getText();
	}

	public String verifyassignmentBtnText() {
		System.out.println("AssignmentBtn text is: " + assignmentBtn.getText());
		return assignmentBtn.getText();
	}

	public String verifyattendanceBtnText() {
		System.out.println("AttendanceBtn text is: " + attendanceBtn.getText());
		return attendanceBtn.getText();
	}

	public String verifylogoutBtnText() {
		System.out.println("LogoutBtn text is: " + logoutBtn.getText());
		return logoutBtn.getText();
	}
}
