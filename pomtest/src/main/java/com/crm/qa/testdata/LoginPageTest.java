package com.crm.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage lpage;
	HomePage Hpage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		lpage= new LoginPage();
	}
	@Test(priority=1)
	public void loginPateTitleTest() {
		String title = lpage.ValidateLoginPageTile();
		Assert.assertEquals(title,"CRM");
	}
	@Test(priority=2)
	public void crmlogovalidateTest() {
		boolean flag = lpage.ValidateLoginImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		lpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tesrDown() {
		driver.quit();
	}
}
