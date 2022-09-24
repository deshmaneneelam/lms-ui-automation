package com.sdet.lms.utilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.lms.pageobjects.PageObjectManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextUI extends BaseClass {

	//WebDriver driver;
	private PageObjectManager pageObjectManager;

	public ContextUI(){
		setup();
		pageObjectManager = new PageObjectManager(driver);
	}
	

	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public ConfigReader getConfigReader() {
		return configReader;
	}
}

