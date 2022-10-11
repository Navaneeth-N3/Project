package com.appname.configs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.appname.helpers.GetData;
import com.appname.helpers.Handler;

public class TestConfig {

	public WebDriver driver;
	public static String propPath = "data/config.properties";
	public static String excelPath = GetData.fromProperties(propPath, "excelpath");
	public static String browserName = GetData.fromProperties(propPath, "browser");
	public static String url = GetData.fromProperties(propPath, "url");
	public static String TESTNG_TESTREPORT_FOLDER = "Test-Reports//"
			+ new SimpleDateFormat("ddMMMYY_HH.mm.ss.S").format(new Date()) + "//";
	//public static String TESTNG_DELETE_FOLDER = "Test-Reports/Delete/";
	//public static String fileDownloadPath = System.getProperty("user.dir") + File.separator + "downloads"
		//	+ File.separator;

	@BeforeSuite
	public void preSuite() {
		File targetfolder = new File(TESTNG_TESTREPORT_FOLDER);
		File srcfolder = new File("./test-output");
		try {
			FileHandler.createDir(targetfolder);
			FileHandler.copy(srcfolder, targetfolder);
			Reporter.log("Old report backed up to folder " + TESTNG_TESTREPORT_FOLDER, true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	

	@BeforeMethod
	public void precondition() {

		if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "./browser_exe/windows/geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		else if (browserName.equals("GC")) {
			System.setProperty("webdriver.chrome.driver", "./browser_exe/windows/chromedriver.exe");
			

			driver = new ChromeDriver();

		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\browser_exe\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

	}

	@AfterMethod
	public void postCondition(ITestResult result) {
		String methodName = result.getName().trim();
		if(ITestResult.FAILURE == result.getStatus())
		{
			Reporter.log("\n*** "+methodName+ " has FAILED ***" , true);
			String fileName = methodName+"_"+
					new SimpleDateFormat("ddMMMYY_HH.mm.ss.S").format(new Date());

			Handler.takeScreenShot(fileName, driver);
		}
		driver.quit();
	}

}
