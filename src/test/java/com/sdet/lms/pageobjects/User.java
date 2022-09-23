package com.sdet.lms.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.lms.utilities.BaseClass;

public class User extends BaseClass {


	public User (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='User']")
	WebElement userTab;
	@FindBy(xpath = "//div[@class=\"box\"][1]")
	WebElement head;

	@FindBy(xpath ="//span[contains(text(),'Showing')]")
	WebElement pagination;
	
	@FindBy(xpath = "//div[contains(text(),'In total there are')]")
	WebElement count;
	
	public Boolean checkEnabled() {
	Boolean nn=driver.findElement(By.xpath("//p-paginator/div/button[3]/span")).isEnabled();
	return nn;
	}
	
	
	
	public String pageCount() {
		return count.getText();
		
	}

	public void clickUserTab() {
		userTab.click();

	}
	public String getTextHead() {
		return head.getText();

	}
	
	public String checkPagination() {
		return pagination.getText();
		
	}

}
