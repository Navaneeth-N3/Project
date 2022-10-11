package com.appname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appname.helpers.Handler;

public class TypesOfWorkPage {
	WebDriver driver;
	public TypesOfWorkPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	@FindBy(id="ext-gen7")
	//@FindBy(xpath="//input[contains(@value,'Create Type of Work')]")
	private WebElement createTypeOfWorkButton;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="//a[text()='Automation']/../..//a[contains(text(),'delete')]")// /-child  /.. - parent
	private WebElement deleteLink;
	
	public void logout(){
		logoutLink.click();
	}	
	
	public void navigateToCreateNewTypeOfWorkPage(){
		createTypeOfWorkButton.click();
	}
	public void deleteTypeOfWork(){
		deleteLink.click();
		Handler.sleep(1000);
		driver.switchTo().alert().accept();
		Handler.sleep(1000);
		
	}
	
}
