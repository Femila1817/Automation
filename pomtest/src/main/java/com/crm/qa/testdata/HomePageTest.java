package com.crm.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage lpage;
	HomePage Hpage;
	ContactPage Cpage;
	
	public HomePageTest() {
		super();
	}
	
	
	//testcases should be independent to each other
	//before every test - launch the browser
	//after every test - close the browser
	@BeforeMethod
	public void setUp() {
		initialization();
		lpage= new LoginPage();
		Cpage = new ContactPage();
		Hpage = lpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String HPT = Hpage.verifyHPTitle();
		Assert.assertEquals("CRM", HPT, "Home Page title not matched");
	}
	
		@Test(priority=2)
		public void verifyUsrNameTest() {
			
			Assert.assertTrue(Hpage.verifyCorrectUserName());
			
		}
		@Test(priority=3)
		public void ClickContactLinkTest() {
			Cpage = Hpage.clickOnContactsLink();
		}
		
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
