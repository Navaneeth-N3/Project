package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.helper.BaseTest;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class Tester1 extends BaseTest {

	//@Test(description="Relative locators- identify book5 which is below the book1 and left of book6")
	public void test() {
		driver.get("https://automationbookstore.dev/");
		Reporter.log("book store app launched");
		WebElement book5 = driver
				.findElement(RelativeLocator.withTagName("li").toLeftOf(By.id("pid6")).below(By.id("pid1")));
		String id = book5.getAttribute("id");
		Reporter.log(id, true);
		Assert.assertEquals(id, "pid5");

	}

	//@Test(description = "Relative locators- identify book2 which is above the book6 and right of book1")
	public void test1() {
		driver.get("https://automationbookstore.dev/");
		Reporter.log("book store app launched", true);
		WebElement book2 = driver.findElement(withTagName("li").toRightOf(By.id("pid1")).above(By.id("pid6")));
		String id = book2.getAttribute("id");
		Reporter.log(id, true);
		Assert.assertEquals(id, "pid2");

	}

	@Test(description = "click login button in actitime app")
	public void test2() throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("actitime app launched", true);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(RelativeLocator.withTagName("a").toRightOf(By.id("keepMeLoggedInSection"))).click();
		Thread.sleep(2000);

	}

}
