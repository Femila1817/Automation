package com.crm.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase{
	
	LoginPage lpage;
	HomePage Hpage;
	ContactPage Cpage;
	
	public ContactPageTest() {
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
		Cpage = Hpage.clickOnContactsLink();
	}
	
	@Test(priority=1)
	public void verifyCPLabel() {
		Assert.assertTrue(Cpage.verifyContactLabel(), "CPL not availalbe");
	}
	@Test(priority=2)
	public void clickCheckBox() {
		Assert.assertTrue(Cpage.selectContacts(),"test teet test");
	}
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
