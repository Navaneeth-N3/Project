package com.pack1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.helper.BaseTest;
import com.helper.Helper;

public class Client1 extends BaseTest{
	
	@Test(description="taking screen shot for an webelement")
	public void test()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("hrm  app launched");
		WebElement e = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		//WebElement e = driver.findElement(By.xpath("//form[@id='frmLogin']/../.."));
		
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Screenshot/Test3.png");
		try {
			FileHandler.copy(srcfile,destfile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("screenShotCaptured");
		
	}
	
	}
