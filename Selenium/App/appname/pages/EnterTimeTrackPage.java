package com.appname.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
	WebDriver driver;
	
	public EnterTimeTrackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(css="div[class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settingsIcon;
	@FindBy(linkText="Types of Work")
	private WebElement typesOfWorkLink;
	@FindBy(css="a[class='content reports']")
	private WebElement reportsTab;
	@FindBy(id="taskSearchControl_field")
	private WebElement addTasksTextbox;
	@FindBy(xpath="//div[@class='taskList']/div[contains(@class,'row task')][2]")
	private WebElement task;
	@FindBy(xpath="//div[@class='taskList']/div[contains(@class,'row task')]")
	private List<WebElement> listOfTasks;
	
	public void logout(){
		logoutLink.click();
	}
	
	public void navigateToTypesOfWorkPage(){
		settingsIcon.click();
		typesOfWorkLink.click();
	}
	
	public void navigateToReportsPage(){
		reportsTab.click();
	}
	
	public void addTask(String taskName){
		addTasksTextbox.sendKeys(taskName);
		Assert.assertEquals(listOfTasks.size(),7);		
		task.click();
	}
	
	
	
}
