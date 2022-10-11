package com.appname.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.appname.configs.TestConfig;
import com.appname.helpers.GetData;
import com.appname.helpers.Handler;
import com.appname.pages.EnterTimeTrackPage;
import com.appname.pages.LoginPage;
import com.appname.pages.ReportsPage;

public class DownloadReportTest extends TestConfig {
	@Test
	public void testDownloadReport() {

		String un = GetData.fromExcel("data/data.xlsx", "Login", 1, 0);
		String pw = GetData.fromExcel("data/data.xlsx", "Login", 1, 1);
		Reporter.log("User " + un, true);
		Reporter.log("pwd " + pw, true);
		LoginPage lp = new LoginPage(driver);
		lp.login(un, pw);
		Handler.sleep(3000);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToReportsPage();
		Handler.sleep(3000);
		ReportsPage rp = new ReportsPage(driver);
		rp.downloadReport();
		Handler.sleep(5000);
	}
}
