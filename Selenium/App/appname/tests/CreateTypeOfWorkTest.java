package com.appname.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;


import com.appname.configs.TestConfig;
import com.appname.helpers.GetData;
import com.appname.helpers.Handler;
import com.appname.pages.CreateNewTypeOfWorkPage;
import com.appname.pages.EnterTimeTrackPage;
import com.appname.pages.LoginPage;
import com.appname.pages.TypesOfWorkPage;

public class CreateTypeOfWorkTest extends TestConfig{

	@Test
	public void testCreateTypeOfWork(){
		String un = GetData.fromExcel(excelPath, "Login", 1, 0);
		String pw = GetData.fromExcel(excelPath, "Login", 1, 1);
		Reporter.log("User "+ un, true);
		Reporter.log("pwd "+ pw, true);
		String tofwork = GetData.fromExcel(excelPath, "CreateTypeOfWorkTest",1,0);
		Reporter.log("tofwork "+ tofwork, true);
		LoginPage lp = new LoginPage(driver);
		lp.login(un,pw);
		Handler.sleep(3000);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToTypesOfWorkPage();
		Handler.sleep(3000);
		TypesOfWorkPage tow = new TypesOfWorkPage(driver);
		tow.navigateToCreateNewTypeOfWorkPage();
		Handler.sleep(3000);
		CreateNewTypeOfWorkPage c = new CreateNewTypeOfWorkPage(driver);
		c.createTypeOfWork(tofwork);
		Handler.sleep(3000);
		tow.logout();
		Handler.sleep(3000);
		
	}
}
