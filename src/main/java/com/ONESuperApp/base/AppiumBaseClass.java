package com.ONESuperApp.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.onefc.constants.Constants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;



 
public class AppiumBaseClass   {

	public static AndroidDriver<AndroidElement> Androiddriver;
	public static IOSDriver<IOSElement> iOSdriver;
	static Properties prop;
	static File appDir = new File("apkfile");
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	static String url;
	public static Constants constants=new Constants();
	static String username="testtest_onuh0R";

    static String accesskey="y5yGq2sypLAmcYSVptsV";
	static String URL="https://"+username+":"+accesskey+"@hub.browserstack.com/wd/hub";


	public static void properties() throws IOException
	{
	    FileInputStream fis = new FileInputStream(constants.getConfigFilePath());
	    prop = new Properties();
		prop.load(fis); 
	    url=(String) prop.get("appiumHostUrl");
	}
	
	public static AndroidDriver<AndroidElement> Androidcapabilities(String appName) throws IOException, InterruptedException {

		properties();
		File app = new File(appDir, (String) prop.get(appName));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.get("deviceName_Android"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,prop.get("androidPlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		   

		Androiddriver = new AndroidDriver<AndroidElement>(new URL(url), capabilities);
		Androiddriver.manage().timeouts().implicitlyWait(constants.getImplicityWaitTime(), TimeUnit.SECONDS);
		return Androiddriver;

	}
	
	public static IOSDriver<IOSElement> iOScapabilities(String appName) throws IOException, InterruptedException {

		properties();
		File app = new File(appDir, (String) prop.get(appName));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.get("deviceName_iOS"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.get("iosPlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		iOSdriver = new IOSDriver<IOSElement>(new URL(url), capabilities);
		iOSdriver.manage().timeouts().implicitlyWait(constants.getImplicityWaitTime(), TimeUnit.SECONDS);
		return iOSdriver;

	}
}
