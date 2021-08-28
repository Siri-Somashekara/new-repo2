package com.atlas.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atlas.automation.base.BaseClass;

public class LpfmPage extends BaseClass {
	
	@FindBy(xpath="//h1[contains(text(),'Landing Page Feed')]")
    public WebElement lpfmPageTitle;
	
	public String expLpfmPageTitle= "Landing Page Feed";
	
	public LpfmPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyLpfmpageTitle() {
		return lpfmPageTitle.getText();
	}
	
	
}
