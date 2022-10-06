package com.sdet.lms.utilities;

import org.openqa.selenium.JavascriptExecutor;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.sdet.lms.pageobjects.PageObjectManager;

public class ContextUI extends BaseClass {

	//WebDriver driver;
	private PageObjectManager pageObjectManager;
	NgWebDriver ngWebDriver;

	public ContextUI(){
		setup();
		pageObjectManager = new PageObjectManager(driver);
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
		ngWebDriver = new NgWebDriver(jsDriver);
	}
	

	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public ConfigReader getConfigReader() {
		return configReader;
	}
	
	public NgWebDriver getNgWebDriver() {
		return ngWebDriver;
	}
}

