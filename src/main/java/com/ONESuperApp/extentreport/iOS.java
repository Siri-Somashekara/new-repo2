package com.ONESuperApp.extentreport;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.ONESuperApp.base.iOS_Utilities;
import com.onefc.constants.Constants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class iOS implements IReporter, ITestListener 
{
	
iOS_Utilities util=new iOS_Utilities();
private ExtentReports extent;
public static Constants constants=new Constants();

public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	extent = new ExtentReports(constants.getOneAppReportiOS()+dateTimeGenerate()+".html");

	for (ISuite suite : suites) {
		Map<String, ISuiteResult> result = suite.getResults();

		for (ISuiteResult r : result.values()) {
			ITestContext context = r.getTestContext();

			buildTestNodes(context.getPassedTests(), LogStatus.PASS);
			buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
			buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
		}
	}

	extent.flush();
	extent.close();
}

private void buildTestNodes(IResultMap tests, LogStatus status) {
	ExtentTest test;

	if (tests.size() > 0) {
		for (ITestResult result : tests.getAllResults()) {
			test = extent.startTest(result.getMethod().getMethodName());

			test.setStartedTime(getTime(result.getStartMillis()));
			test.setEndedTime(getTime(result.getEndMillis()));

			for (String group : result.getMethod().getGroups())
				test.assignCategory(group);

			if (result.getThrowable() != null) {
				test.log(status, result.getThrowable());
			} else {
				test.log(status, "Test " + status.toString().toLowerCase() + "ed");
			}

			extent.endTest(test);
		}
	}
}

private Date getTime(long millis) {
	Calendar calendar = Calendar.getInstance();
	calendar.setTimeInMillis(millis);
	return calendar.getTime();
}

public void onTestFailure(ITestResult result)
{
	String testName= result.getName();
	try {
		util.getScreenshot(testName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static String dateTimeGenerate(){

    Format formatter = new SimpleDateFormat("YYYYMMdd_HHmmssSSS");

    Date date = new Date(System.currentTimeMillis());

   return formatter.format(date);

}
}

