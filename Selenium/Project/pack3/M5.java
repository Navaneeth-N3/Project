package com.pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class M5 {
	
	@Test
	public void test()
	{
		HtmlUnitDriver driver = new HtmlUnitDriver();//fastest driver
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Launched Headless HtmlUnitDriver and maximized", true);
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon app launched", true);
		Reporter.log("page title "+ driver.getTitle(), true);
		driver.quit();
		
	}

}
