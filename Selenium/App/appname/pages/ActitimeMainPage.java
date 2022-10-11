package com.appname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.appname.helpers.Handler;



public class ActitimeMainPage {
	WebDriver driver;
	public ActitimeMainPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Basic Facts")
	private WebElement basicFactsLink;
	
	public void verifyUrl(){
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.actitime.com/";
		Assert.assertEquals(actualUrl, expectedUrl);		
	}
	public void navigateToLoginPage(String title){
		driver.close();
		Handler.switchToWindow(driver, title);
	}
}
