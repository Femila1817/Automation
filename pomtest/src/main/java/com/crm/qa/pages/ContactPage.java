package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{
	
	@FindBy(xpath="//div[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	@FindBy(xpath="//td[@class,'test teet test']")
	WebElement contactpagecheck;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactLabel() {
		return contactLabel.isDisplayed();
	}
	
	public boolean selectContacts() {
		//contactpagecheck.click();	
		
		return contactpagecheck.isSelected();
		
	}
}
