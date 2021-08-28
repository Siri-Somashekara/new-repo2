package com.ONESuperApp.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.onefc.constants.Constants;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

	public class Android_Utilities extends AppiumBaseClass {
		
		public static long PAGE_LOAD_TIMEOUT = 20;
		public static long IMPLICIT_WAIT = 20;
		public static Constants constants=new Constants();
		
		 public static void scrollDown() throws NumberFormatException, IOException{
		        Dimension dimension = Androiddriver.manage().window().getSize();
		        int scrollStart = (int) (dimension.getHeight() *Double.parseDouble(Files.readAllLines(Paths.get(constants.getTestData_scroll())).get(0)));
		        int scrollEnd = (int) (dimension.getHeight() * Double.parseDouble(Files.readAllLines(Paths.get(constants.getTestData_scroll())).get(1)));

		        new TouchAction((PerformsTouchActions) Androiddriver)
		                .press(PointOption.point(0, scrollStart))
		                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		                .moveTo(PointOption.point(0, scrollEnd))
		                .release().perform();
		    }
		 
		 public static void scrollDown_tillEnd() throws NumberFormatException, IOException{
			 for(int i =0;i<=3;i++)
			 {
			 Dimension dimension = Androiddriver.manage().window().getSize();
		        int scrollStart = (int) (dimension.getHeight() * Double.parseDouble(Files.readAllLines(Paths.get(constants.getTestData_scroll())).get(0)));
		        int scrollEnd = (int) (dimension.getHeight() * Double.parseDouble(Files.readAllLines(Paths.get(constants.getTestData_scroll())).get(1)));

		        new TouchAction((PerformsTouchActions) Androiddriver)
		                .press(PointOption.point(0, scrollStart))
		                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		                .moveTo(PointOption.point(0, scrollEnd))
		                .release().perform();
		 }
		 }
		 
		 public static void scrollNClick(WebElement el) throws NumberFormatException, IOException{
		        int retry = 0;
		        while(retry <= 5){
		            try{
		                el.click();
		                break;
		            }catch (org.openqa.selenium.NoSuchElementException e){
		                scrollDown();
		                retry++;
		            }
		        }
		    }
		 
		 
		 public static void scrollAndClickbyText(String visibleText) {
			 Androiddriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
		        }
		 
		 public static WebElement scrolltoElementByText(String visibleText) {
			 WebElement src = null;
			 return Androiddriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
		        }
		   
		 public static void getScreenshot(String testName) throws IOException {
				TakesScreenshot ts = (TakesScreenshot) Androiddriver;
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				File source = ts.getScreenshotAs(OutputType.FILE);
				File target = new File(constants.getAppScreenShotAndroid()+testName +" " + formatter.format(calendar.getTime())+" " +System.currentTimeMillis()  + ".png");
				FileUtils.copyFile(source, target);

			}
		 
		 public static void dragAndDrop(String Source, String Destination )
			{
				TouchAction action=new TouchAction((PerformsTouchActions)Androiddriver);
				action.longPress(ElementOption.element(scrolltoElementByText(Source))).moveTo(ElementOption.element(scrolltoElementByText(Destination))).release().perform();
			}
		 
	
		
	}
	


