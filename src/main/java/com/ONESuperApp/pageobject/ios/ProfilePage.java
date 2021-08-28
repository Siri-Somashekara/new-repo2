package com.ONESuperApp.pageobject.ios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.base.Android_Utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePage extends AppiumBaseClass {
	
	Android_Utilities util = new Android_Utilities();
	public ProfilePage(	IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	WebDriverWait wait = new WebDriverWait(iOSdriver,20);	

	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\" \"])[1]/XCUIElementTypeOther[2]")
	public MobileElement profile;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Follow Favorites Follow countries and athletes you like to be the first to know updates, news and new videos about them\"]")
	public MobileElement folllowfav;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"ADD/REMOVE COUNTRIES\"])[2]")
	public MobileElement addedit;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Ireland\"])[2]")
	public MobileElement ireland;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
	public MobileElement gmail;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
	public MobileElement FB;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	public MobileElement Continue_signin;
	
	@FindBy(xpath="//XCUIElementTypeLink[@name=\"ONETESTFC TEST teamcreationcheck@gmail.com\"]")
	public MobileElement emailid1;
    
    @FindBy(xpath="//XCUIElementTypeLink[@name=\"onetestfc one testconsentform098@gmail.com\"]")
   	public MobileElement emailid2;
    
    @FindBy(xpath="//XCUIElementTypeLink[@name=\"onetestfc test fctestonetestfctestfc@gmail.com\"]")
   	public MobileElement emailid3;
    
    @FindBy(xpath="//XCUIElementTypeLink[@name=\"onetest account onetestfctotestuser@gmail.com\"]")
   	public MobileElement emailid4;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Logout\"]")
	public MobileElement Logout;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"YES\"]")
	public MobileElement yes;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Use another account\"]")
    public MobileElement useAnotherAccount_Button;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name=\"Email or phone\"]")
    public MobileElement tetxField_forEmail;
	
	@FindBy(xpath="//XCUIElementTypeSecureTextField[@name=\"Enter your password\"]")
    public MobileElement tetxField_forPassword;
	
	@FindBy(xpath="(//XCUIElementTypeButton[@name=\"Next\"])[1]")
    public MobileElement next;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"\"]")
    public MobileElement BackButton;

	public void Gmail_Login() throws InterruptedException
	{
		profile.click();
		gmail.click();
		Continue_signin.click();
	}
	
	public void FB_Login() throws InterruptedException
	{
		profile.click();
		FB.click();
		Continue_signin.click();
		wait.until(ExpectedConditions.elementToBeClickable(Continue_signin));
		Continue_signin.click();
	}
	
	public void Logout() throws InterruptedException
	{
		profile.click();
		Logout.click();
		yes.click();
		wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		BackButton.click();
	}
	
	public void newGmailLogin() throws InterruptedException, IOException
	{
		profile.click();
		gmail.click();
		Continue_signin.click();
		wait.until(ExpectedConditions.visibilityOf(useAnotherAccount_Button));
		useAnotherAccount_Button.click();
		tetxField_forEmail.click();
		tetxField_forEmail.sendKeys(Files.readAllLines(Paths.get(constants.getTestData_gmailLogin())).get(0));
		next.click();
		tetxField_forPassword.click();
		tetxField_forPassword.sendKeys(Files.readAllLines(Paths.get(constants.getTestData_gmailLogin())).get(1));
		next.click();
		wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		BackButton.click();
	}
	
	
	
}
