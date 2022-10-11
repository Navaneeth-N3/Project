package com.appname.helpers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Handler {
	
	
	public static void selectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	public static void selectDDLByValue(WebElement ddl, String value) 
	{
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	public static void selectDDLByVisibleText(WebElement ddl, String text)
	{
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
	}
	public static void deSelectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select(ddl);
		sct.deselectByIndex(index);
	}
	public static void deSelectDDLByValue(WebElement ddl, String value) 
	{
		if(verifyDDL(ddl)==true)
		{
			Select sct = new Select(ddl);
			sct.deselectByValue(value);
		}
	}
	public static void deSelectDDLByVisibleText(WebElement ddl, String text)
	{
		if(verifyDDL(ddl)==true)
		{
			Select sct = new Select(ddl);
			sct.deselectByVisibleText(text);
		}
	}
	public static void deSelectAll(WebElement ddl)
	{
		if(verifyDDL(ddl)==true)
		{
			Select sct = new Select(ddl);
			sct.deselectAll();
		}
	}
	public static boolean verifyDDL(WebElement ddl)
	{
		Select sct = new Select(ddl);
		boolean status = sct.isMultiple();
		return status;
	}
	public static void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public static void dismissAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public static void enterTextOnAlert(WebDriver driver, String data)
	{
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(data);
	}
	public static String getAlertText(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		return alertMsg;
	}
	public static void mouseHover(WebDriver driver, WebElement element) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void rightClick(WebDriver driver, WebElement element) 
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	public static void doubleClick(WebDriver driver, WebElement element) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	public static void dragAndDrop(WebDriver driver, WebElement src, WebElement dst) 
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}
	
	public static void switchToWindow(WebDriver driver, 
			String expectedTitle){
		
		Set<String> wndHandles = driver.getWindowHandles();
		Iterator<String> it = wndHandles.iterator();
		
		while(it.hasNext()){
			
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().equals(expectedTitle)){
				break;
			}
		}		
	}
	
	public static void sleep(long milis)
	{
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void takeScreenShot(String dest, WebDriver driver )
	{
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Screenshot/"+dest+".png");
		try {
			FileHandler.copy(srcfile,destfile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
