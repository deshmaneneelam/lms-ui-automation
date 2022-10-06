package com.sdet.lms.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.sdet.lms.utilities.BaseClass;


public class Registration extends BaseClass {
	
	
	public Registration (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 
	}
	
	@FindBy(id="firstname")
   WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="address")
	WebElement Address;
	
	@FindBy(name="streetname")
	WebElement streetName;
	
	@FindBy(name="city")
	WebElement City;
	@FindBy(name="state")
	WebElement state ;
	
	@FindBy(name="day")
	WebElement day;
	
	@FindBy(name="month")
	WebElement month;
	
	@FindBy(name="year")
	WebElement year;
	

	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="phonenumber")
	WebElement phonenumber;
	
	@FindBy(name="password")
	WebElement password;
	

	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="login")
	WebElement login;
	

	
	@FindBy(name="password1")
	WebElement password1;
	

	public void  enterfirstname(String firstname)
	   {
		   firstName.sendKeys(firstname);
		  
	   }
   
	public void  enterlastname(String lastname)
	   {
		   lastName.sendKeys(lastname);
		  
	   }
	
	public void  enteraddress(String address)
	   {
		   Address.sendKeys(address);
		  
	   }
	

	public void  streetname(String streetname)
	   {
		   streetName.sendKeys(streetname);
		  
	   }
	
	public void phonenumber(String PhoneNumber)
	{
		phonenumber.sendKeys(PhoneNumber);
	}
	
	public void UserName(String username)
	   {
		   streetName.sendKeys(username);
		  
	   }
	
	public void Password(String password)
	   {
		   streetName.sendKeys(password);
		  
	   }
	
	public void Email(String email)
	   {
		   streetName.sendKeys(email);
		  
	   }
	
 public String getFirstName() {
		return firstName.getText();
	}

	 

	public String getLastName() {
		return lastName.getText();
	}

	public String getAddress() {
		return Address.getText();
	}
	
	
	public String getphonenumber() {
		return phonenumber.getText();
	}
 
	public String getusername() {
		return username.getText();
	}
	
	public String getpassword() {
		return password.getText();
	}
	
	public String email() {
		return email.getText();
	}
	
	


public static void selectValueFromDropDown(WebElement element,String value) {
   
Select select = new Select(element);
select.selectByVisibleText(value);

}
 
}
