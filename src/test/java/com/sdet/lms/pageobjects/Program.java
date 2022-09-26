package com.sdet.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Program {
		
	WebDriver driver;
	
	/**
	 * Initialize web elements
	 * @param d driver
	 */
	public Program(WebDriver d){
		 this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	@CacheLookup
	@FindBy(linkText="Program")
	private WebElement title;
	
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']/div")
	private WebElement totalCount;
	
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	private WebElement multipleDeleteBtn;
	
	@FindBy(xpath="//input[@class='p-inputtext p-component']")
	private WebElement searchText;
	
	@FindBy(xpath="//button[@id='new']")
	private WebElement addProgramBtn;
	
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']/div")
	private WebElement totalEntries;
	
	@FindBy(xpath="//i[@class='pi pi-search']")
	private WebElement searchElement;
	
	/**
	 * Verify title
	 * @return string
	 */
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * Verify page title is displayed
	 * @return boolean
	 */
	public boolean isPageTitleDisplayed() {
		return title.isDisplayed();
	}
	
	/**
	 * get total page count string
	 * @return string
	 */
	public String getTotalPagesString() {
		System.out.println("aaaa"+totalCount.getText());
		return totalCount.getText();
	}
	
	public String getTotalEntries() {
		String entries = totalEntries.getText();
		return entries.substring(19,21);
	}
	
	/**
	 * Check if delete button is disabled 
	 * @return boolean
	 */
	public boolean isDisabled() {
		return multipleDeleteBtn.isEnabled();
	}
	
	public String searchBoxText() {
		return  searchText.getAttribute("placeholder");	
	}
	
	public WebElement getSearchElement() {
		return searchText;
	}
	public void addProgram() {
		addProgramBtn.click();
	}
}
