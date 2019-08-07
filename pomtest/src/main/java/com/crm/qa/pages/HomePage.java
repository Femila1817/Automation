package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Femila D')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	//@FindBy(xpath="//a[contains(text(),'deals')]")
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHPTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return userNameLabel.isDisplayed();
		
		
	}
	
	public ContactPage clickOnContactsLink() {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		contactLink.click();
		
		return new ContactPage();
	}
	
	public DealsPage clickOndealsLink() {
		dealLink.click();
		
		return new DealsPage();
	}
	
	public TaskPage clickOntaskLink() {
		taskLink.click();
		return new TaskPage();
	}
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactLink).build().perform();
	}

}
