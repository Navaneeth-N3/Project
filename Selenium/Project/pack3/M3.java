package com.pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M3 {
	
	@Test
	public void test()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Launched Firefox and maximized", true);
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon app launched", true);
		Reporter.log("page title "+ driver.getTitle(), true);
		driver.quit();
		
	}

}
