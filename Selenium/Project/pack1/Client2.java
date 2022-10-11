package com.pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.helper.BaseTest;
import com.helper.Helper;

public class Client2 extends BaseTest{
	
	@Test(description="opening a new tab and launching conduit ")
	public void test1()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("book store app launched", true);
		Helper.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);// newtab
		Helper.sleep(5000);
		Reporter.log("New Tab oppened", true);
		driver.navigate().to("https://react-redux.realworld.io/#/login");
		Helper.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("someUSer");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("somePwd");
		Helper.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();//set,list also possible
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("txtUsername")).sendKeys("someUSer");
		Helper.sleep(5000);
	}
	
	//@Test(description="opening a new window and launching conduit ")
	public void test2()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("book store app launched", true);
		Helper.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);// new window
		Helper.sleep(5000);
		Reporter.log("new window opened", true);
		driver.navigate().to("https://react-redux.realworld.io/#/login");
		Helper.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("someUSer");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("somePwd");
		Helper.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("txtUsername")).sendKeys("someUSer");
		Helper.sleep(5000);
		
		
	}
	
	



}
