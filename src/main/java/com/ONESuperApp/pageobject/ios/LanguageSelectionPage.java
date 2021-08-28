package com.ONESuperApp.pageobject.ios;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ONESuperApp.base.AppiumBaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LanguageSelectionPage extends AppiumBaseClass
{
	public LanguageSelectionPage(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"English\"]")
	public WebElement englishLocale;
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"हिंदी\"]")
	public WebElement hindiLocale;
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"ភាសាខ្មែរ\"]")
	public WebElement khmerLocale;
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Bahasa Indonesia\"]")
	public WebElement bahasaLocale;
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"\"]")
    public MobileElement languageSelectionBtn;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
	public WebElement AllowNoti;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"\"]")
	public WebElement FantasyClose;
	
	public void selectLocale(MobileElement element) 
	{
		element.click();	
	}
	public void languageSelectionClick() throws InterruptedException {
	languageSelectionBtn.click();
	AllowNoti.click();
	//FantasyClose.click();
	}

}
