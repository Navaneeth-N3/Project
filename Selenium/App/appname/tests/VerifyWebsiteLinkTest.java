package com.appname.tests;

import org.testng.annotations.Test;

import com.appname.configs.TestConfig;
import com.appname.helpers.Handler;
import com.appname.pages.ActitimeMainPage;
import com.appname.pages.LoginPage;

public class VerifyWebsiteLinkTest extends TestConfig {

	@Test
	public void testVerifyWebsiteLink() {
		LoginPage lp = new LoginPage(driver);
		lp.navigateToWebsite();
		ActitimeMainPage ahp = new ActitimeMainPage(driver);
		ahp.verifyUrl();
		ahp.navigateToLoginPage("actiTIME - Login");
		lp.login("admin", "manager");
		Handler.sleep(3000);
	}
}
