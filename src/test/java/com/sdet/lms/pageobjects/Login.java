package com.sdet.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login{
	
	WebDriver driver;
		
	public Login (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement userName;
		
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//form/p")
	WebElement isLoginPage;
	
	@FindBy(xpath="//body//span")
	WebElement pageTitle;
	
	/*public void login(String username, String password)  {
	userName.sendKeys(username);
	passWord.sendKeys(password);
	loginBtn.click();	
	}*/
	
	public void  enterUsername(String username){
		userName.sendKeys(username);
	}
	   
	public void  enterPassword(String password){
		passWord.sendKeys(password);
	}
	
	public void loginClick(){
		 loginBtn.click();
	}
	
	public String getUserName() {
		return userName.getText();
	}
	
	public String getPassWord() {
		System.out.println("passWord"+passWord.getText());
		return passWord.getText();
	}
   
	public String confirmLoginPage() {
		return isLoginPage.getText();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}

   