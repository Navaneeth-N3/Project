package com.appname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appname.helpers.Handler;

public class LoginPage {
	WebDriver driver;	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//Page Decoration
		PageFactory.initElements(driver,this);		
	}	
	@FindBy(id="username")
	private WebElement usernameTextbox;
	@FindBy(name="pwd")
	private WebElement passwordTextbox;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	@FindBy(linkText = "actiTIME Inc.")
	private WebElement websiteLink;
	
	public void login(String un, String pw){		
		usernameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pw);
		loginButton.click();		
	}	
		
	public void navigateToWebsite(){
		websiteLink.click();
		Handler.switchToWindow(driver,"actiTIME - Time Tracking & Scope Management Software");
	}	
	
	
}
