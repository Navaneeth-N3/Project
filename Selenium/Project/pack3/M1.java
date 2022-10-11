package com.pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M1 {
	
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Launched chrome and maximized", true);
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon app launched", true);
		Reporter.log("page title "+ driver.getTitle(), true);
		driver.quit();
		
	}

}
