package com.appname.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.appname.configs.TestConfig;
import com.appname.helpers.GetData;
import com.appname.helpers.Handler;
import com.appname.pages.EnterTimeTrackPage;
import com.appname.pages.LoginPage;



public class AddTasksTest extends TestConfig{

	@Test
	public void testAddTask(){
		
		String un = GetData.fromExcel(excelPath, "Login", 1, 0);
		String pw = GetData.fromExcel(excelPath, "Login", 1, 1);
		Reporter.log("User "+ un, true);
		Reporter.log("pwd "+ pw, true);
		LoginPage lp = new LoginPage(driver);
		lp.login(un, pw);		
		Handler.sleep(2000);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		
		ettp.addTask("P");
		Handler.sleep(3000);
	}
}
