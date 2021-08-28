package com.ONESuperApp.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import com.ONESuperApp.base.AppiumBaseClass;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage extends AppiumBaseClass {
	
	public LandingPage(IOSDriver<IOSElement>  driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
