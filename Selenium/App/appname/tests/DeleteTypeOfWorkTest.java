package com.appname.tests;

import org.testng.annotations.Test;


import com.appname.configs.TestConfig;
import com.appname.helpers.Handler;
import com.appname.pages.EnterTimeTrackPage;
import com.appname.pages.LoginPage;
import com.appname.pages.TypesOfWorkPage;

public class DeleteTypeOfWorkTest extends TestConfig{

	@Test
	public void testDeleteTypeOfWork(){
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manager");
		Handler.sleep(1000);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToTypesOfWorkPage();
		Handler.sleep(1000);
		TypesOfWorkPage tow = new TypesOfWorkPage(driver);
		tow.deleteTypeOfWork();
		Handler.sleep(2000);
				tow.logout();
	}
}
