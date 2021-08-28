package com.onefc.constants;

import lombok.Data;

@Data
public class Constants {

	private String configFilePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
	private String chromeDriverPath = System.getProperty("user.dir") + "/Drivers/chromedriver";
	private String geckoDriverPath = System.getProperty("user.dir") + "/Drivers/geckodriver";
	private String appiumReportPath = System.getProperty("user.dir") + "/reports/ONESuperAppReport/";
	private String atlasReportPath = System.getProperty("user.dir") + "/reports/atlasReport/";
	private long implicityWaitTime = 60;
	private String atlasFailedScreenshotsPath = System.getProperty("user.dir") + "/Screenshots/atlas/";
	private String testData_gmailLogin=System.getProperty("user.dir") +"/src/test/resources/testData/GmailLogin_testData(newUser).txt";
	private String testData_scroll=System.getProperty("user.dir") +"/src/test/resources/testData/scroll_values.txt";
	private String testData_DragAndDrop=System.getProperty("user.dir") +"/src/test/resources/testData/dragAndDrop_PositionValues.txt";
	private String testData_teamNames=System.getProperty("user.dir") +"/src/test/resources/testData/teamNames_forErrorMsg.txt";
	private String testData_GmailShare=System.getProperty("user.dir") +"/src/test/resources/testData/GmailCredentials_forShare.txt";
	private String oneAppReportAndroid=System.getProperty("user.dir")+"/reports/ONESuperApp/Android/oneappreport";
	private String oneAppReportiOS=System.getProperty("user.dir")+"/reports/ONESuperApp/iOS/oneappreport";
	private String appScreenShotAndroid=System.getProperty("user.dir") + "/Screenshots/ONESuperApp/Android/";
	private String appScreenShotiOS=System.getProperty("user.dir") + "/Screenshots/ONESuperApp/iOS/";
	private String TestDataPath = System.getProperty("user.dir")+"/src/test/resources/TestData/Login_testData.txt";

}
