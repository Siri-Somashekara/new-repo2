package com.atlas.automation.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atlas.automation.base.BaseClass;
import com.atlas.automation.util.TestUtil;

public class WebdriverActions extends BaseClass {

	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void dragAndDrop(WebElement scrwb, WebElement dstwb) {
		Actions action = new Actions(driver);
		action.clickAndHold(scrwb).moveToElement(dstwb).release().build().perform();
	}

	public void selectDropdownOptions(WebElement Selwb, String text) {
		Select sel = new Select(Selwb);
		sel.selectByVisibleText(text);
	}

	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void waitForElementToLoad() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, TestUtil.PAGE_LOAD_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(element));
		element1.click();
	}
	

	public void verticalScroll(int width,long scrollHeight) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+width+","+scrollHeight+")");
	}

	public void scrollToDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void verticalScrollToTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}
	
	public void searchDropdownOptions(WebElement Selwb, String text) {

		 Actions performAct = new Actions(driver);

		     performAct.sendKeys(Selwb,text).build().perform();

		}

}
