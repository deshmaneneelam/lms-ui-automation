package com.sdet.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.lms.utilities.BaseClass;

public class Login extends BaseClass{
	
WebDriver driver;
	

	public Login (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
   WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="login")
	WebElement loginBtn;

   public void  enterUsername(String username)
   {
	   userName.sendKeys(username);
	  
   }
   
   public void  enterPassword(String password)
   {
	   passWord.sendKeys(password);
	  
   }
   public void loginClick()
	{
	   loginBtn.click();
	}
   
   
   
}
