package com.atlas.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.atlas.automation.util.TestUtil;
import com.atlas.automation.util.WebEventListener;
import com.onefc.constants.Constants;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static Constants constants = new Constants();

	public static void initialization() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(constants.getConfigFilePath());
		prop.load(ip);
		String browserName = prop.getProperty("browser");

		logger = Logger.getLogger("atlasautomation");
		PropertyConfigurator.configure("Log4j.properties");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", constants.getChromeDriverPath());
			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", constants.getGeckoDriverPath());
			driver = new FirefoxDriver();
		} else if (browserName.equals("Safari")) {
			driver = new SafariDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListnerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
