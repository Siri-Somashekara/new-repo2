package com.atlas.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atlas.automation.base.BaseClass;

public class VideoLibraryPage extends BaseClass{
	
	@FindBy(xpath="//h1[contains(text(),'Video library')]")
	public WebElement videoLibraryTitle;
	
	public String expVideoLibraryPageTitle= "Video library";
	
	public VideoLibraryPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyVideoLibraryPageTitle() {
		String videopagetitle=videoLibraryTitle.getText();
		return videopagetitle;
	}

}
