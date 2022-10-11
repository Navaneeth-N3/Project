package com.appname.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appname.helpers.Handler;

public class ReportsPage {
	WebDriver driver;
	public ReportsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="ext-gen38")
	private WebElement createChartButton;
	
	@FindBy(className="config-name")
	private WebElement configName;
	
	@FindBy(className="exportToCSV")
	private WebElement exportToCSV;
	
	@FindBy(id="createChartLightbox_commitBtn")
	private WebElement exportPdfButton;
	
	@FindBy(id="createChartLightbox_downloadPdfBtn")
	private WebElement downloadButton;	
	
	public void downloadReport(){
		
		configName.click();
		Handler.sleep(3000);
		exportToCSV.click();
		Handler.sleep(3000);
	}
	
	
}
