package com.atlas.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atlas.automation.base.BaseClass;

public class CacheInvalidationPage extends BaseClass{
	
	 @FindBy(xpath="//h3[contains(text(),'Invalidate Cache')]")
	 public WebElement cacheInvalidationPageTitle;
	 
	 public String expCacheInvalidationPageTitle= "Invalidate Cache";
	 
	 
	 public CacheInvalidationPage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 public String verifyCacheInvalidationPageTitle() {
		 return cacheInvalidationPageTitle.getText();
	 }

}
