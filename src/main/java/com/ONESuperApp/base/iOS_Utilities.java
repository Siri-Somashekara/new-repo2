package com.ONESuperApp.base;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.onefc.constants.Constants;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class iOS_Utilities extends AppiumBaseClass {
	
	public static Constants constants=new Constants();
	
	public static void getScreenshot(String testName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) iOSdriver;
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(constants.getAppScreenShotiOS()+testName +" " + formatter.format(calendar.getTime())+" " +System.currentTimeMillis()  + ".png");
		FileUtils.copyFile(source, target);

	}

	public static void scrollRight_toElement(MobileElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) iOSdriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "right");
		scrollObject.put("xpath", element.getId());
		js.executeScript("mobile: scroll", scrollObject);
	}
	
	public static void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) iOSdriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}
	
	public static void scrollUp()
	{
		JavascriptExecutor js = (JavascriptExecutor) iOSdriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
	}
	
	public static WebElement scrolltoElementByText(String visibleText) {
		final HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("predicateString", "value == '" + visibleText + "'");
        scrollObject.put("toVisible", "true");
        iOSdriver.executeScript("mobile: scroll", scrollObject);
		return null;
	   }
	
	 public static void dragAndDrop(MobileElement Source, MobileElement Destination )
		{
			TouchAction action=new TouchAction((PerformsTouchActions)iOSdriver);
			action.longPress(ElementOption.element(Source)).waitAction().moveTo(ElementOption.element(Destination)).release().perform();
		}
	 
}
