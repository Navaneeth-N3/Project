package com.appname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTypeOfWorkPage {
	WebDriver driver;
	public CreateNewTypeOfWorkPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	@FindBy(id="name")
	private WebElement nameTextbox;
	@FindBy(linkText="Types of Work")
	private WebElement typeOfWorkLink;
	@FindBy(css="input[type='submit']")
	private WebElement createButton;
	
	public void createTypeOfWork(String typeOfWorkName){
		nameTextbox.sendKeys(typeOfWorkName);
		//typeOfWorkLink.click();
		createButton.click();
	}
	
}
