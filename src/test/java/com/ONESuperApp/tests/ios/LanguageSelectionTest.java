package com.ONESuperApp.tests.ios;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LanguageSelectionTest extends AppiumBaseClass {

	@Test
	public void languageSelectionTest() throws IOException, InterruptedException {
		IOSDriver<IOSElement> driver = iOScapabilities("ONESuperApp_iOS");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
	}
	
	@AfterClass
	public void tearDown() {
		iOSdriver.quit();
	}

}
