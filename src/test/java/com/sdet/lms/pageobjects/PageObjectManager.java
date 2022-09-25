package com.sdet.lms.pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	private WebDriver driver;
	
	private Program programPage;
	private Batch batchPage;
	private User userPage;
	private Login loginPage;
	private Assignment assignPage;
	private HomePage homePage;
	
	public PageObjectManager(WebDriver d) {
		this.driver = d;
	}

	public Program getProgramPage(){
		return (programPage == null) ? programPage = new Program(driver) : programPage;
	}

	public Batch getBatchPage() {
		return (batchPage == null) ? batchPage = new Batch(driver) : batchPage;
	}
	
	public Login getLoginPage() {
		return (loginPage == null) ? loginPage = new Login(driver) : loginPage;
	}
	
	public User getUserPage() {
		return (userPage == null) ? userPage = new User(driver) : userPage;
	}
	
	/*public Assignment getAssignmentPage() {
		return (assignPage == null) ? assignPage = new Assignment(driver) : assignPage;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}*/
}
