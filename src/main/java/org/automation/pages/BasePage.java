package org.automation.pages;



import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
//import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;

import org.automation.driver.DriverManager;
import org.automation.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import lombok.AccessLevel;

import lombok.NoArgsConstructor;



/**
 * This class has methods to do various operations with webelements.
 * 
 * <br>
 * Class is final to avoid extend.
 * <br><br>
 * Apr 8, 2021
 * @author User1
 * @version 1.0
 *
 */



@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BasePage {

	 Logger logger = LoggerFactory.getLogger(BasePage.class);




	private Select getSelectWebElement(By by) {
		return new Select(DriverManager.getDriver().findElement(by));
	}
	
	protected void wait(By by, int milliSeconds) {

		try {
			Thread.sleep(milliSeconds);
		//	DriverManager.getDriver().findElement(by).wait(milliSeconds);
			logger.info(" - Element Found:: " + by + " waited for :: " +milliSeconds+ " MiliSeconds ");
		} catch (InterruptedException e) {
			e.printStackTrace();
			logger.error(" - Element NOT FOUND by :: "+ by);
		}
	}

	protected void staticwait(int milliSeconds){
		try {
			Thread.sleep(milliSeconds);
			logger.info("Waited for :: " + milliSeconds);
		}catch (InterruptedException e){
			e.getStackTrace();

		}
	}

	protected void click(By by, String elementNameForReport) {
		try {

			getWebElement(by, elementNameForReport).click();
			ExtentLogger.info(elementNameForReport + " - clicked Successfully.");
			logger.info(" - Element Clicked by :: " +by);


		} catch (Exception e) {
		//	e.printStackTrace();
			logger.error(" - Element NOT FOUND :: " + by);
			ExtentLogger.fail(elementNameForReport+ " - " + "Element NOT FOUND :: "+by);

		}
	}

	protected void clear(By by, String elementNameForReport) {
		try {

			getWebElement(by, elementNameForReport).clear();
			logger.info(" - Element Cleared :: " +by);
			ExtentLogger.info(elementNameForReport + " - cleared Successfully.");

		}catch (Exception e){
			logger.error(elementNameForReport+" - Element Not Found" +by);
			ExtentLogger.fail(elementNameForReport + "Element Not Found " + by);

		}

	}

	protected void sendKeys(By by, String value, String elementNameForReport) {
		try {
			getWebElement(by, elementNameForReport).sendKeys(value);
			logger.info(" - Keys Sent :: " +by+ "Value :: " + value);
			ExtentLogger.info(elementNameForReport + " - '" + value + "' sent successfully.");
		} catch (Exception e){
			logger.error(" - Unable to send keys :: " + by);
			ExtentLogger.fail(elementNameForReport+" Unable to send keys " + " Locator:: " +by);
		}

	}


	
	public String getText(By by, String elementNameForReport) {
		try {
			String text = getWebElement(by, elementNameForReport).getText();
			ExtentLogger.info(elementNameForReport +" - '" + text + "' obtained successfully.");
			logger.info(" - Element Text Obtained :: " +text+" Locator: " +by);
			return text;
		} catch (Exception e){
			ExtentLogger.fail(elementNameForReport + " - Unable to Obtain Text " + " - Locator: " +by);
			logger.error(" - Element Not found:: " + by);
			return null;
		}


	}

	public boolean isDisplayed(By by, String elementNameForReport) {
	//	var element = getWebElement(by,elementNameForReport);
	//	boolean element = getWebElement(by,elementNameForReport).isDisplayed();
		boolean element = false;

			try {
				element = getWebElement(by,elementNameForReport).isDisplayed();
				logger.info("Element Displayed :: " + by);
				ExtentLogger.info("Element Displayed :: " + by);
				return element;

			}
			catch (Exception e){
				logger.error(" - Element NOT Displayed using :: "+by);
				ExtentLogger.fail(elementNameForReport + " - " + by + " - Element Not Displayed");
				return false;
			}

	}

	protected boolean isSelected(By by) {
		return DriverManager.getDriver().findElement(by).isSelected();
	}

	protected boolean isEnabled(By by, String elementNameForReport) {
		try{
			logger.info(" - Element Is Enabled:: " + by);
			ExtentLogger.info(elementNameForReport + " - " + by + " Element is Enabled");
		//	return DriverManager.getDriver().findElement(by).isEnabled();
			return getWebElement(by, elementNameForReport).isEnabled();

		}catch (Exception e){
			logger.error(" - Element Not Found :: " + by);
			ExtentLogger.fail(elementNameForReport + " - " + by + "Element is Not Enabled");
			return false;
		}

	}
	
	protected WebElement getWebElement(By by, String elementNameForReport) {
		try {

			return DriverManager.getDriver().findElement(by);

		}catch (Exception e) {
			logger.error(" - Element not Found :: " + by);
			ExtentLogger.fail(elementNameForReport + " - Element Not Found :: " + by);
			return null;
		}

	}
	protected void validateText(By by, String expectedText,String elementNameForReport){
		String actualValue = getText(by,elementNameForReport);
		if(Objects.equals(actualValue, expectedText)){
			logger.info(elementNameForReport + "[VALIDATION PASS] - [ACTUAL VALUE: "+actualValue+ "] " + "[EXPECTED VALUE: "+expectedText+" ]");
			ExtentLogger.info(elementNameForReport + "[VALIDATION PASS] - [ACTUAL VALUE: "+actualValue+ "] " + "[EXPECTED VALUE: "+expectedText+" ]");
		}else {
			ExtentLogger.fail(elementNameForReport+"[VALIDATION Fail] - [ACTUAL VALUE: "+actualValue+ "] " + "[EXPECTED VALUE: "+expectedText+" ]");
			logger.error(elementNameForReport + "[VALIDATION FAIL] - [ACTUAL VALUE: "+actualValue+ "] " + "[EXPECTED VALUE: "+expectedText+" ]");

		}
	}

	protected void scrollDown(By by, String elementNameForReport, By by1){
		TouchAction action = new TouchAction(DriverManager.getDriver());

		try {
			//The viewing size of the device
			Dimension size =DriverManager.getDriver().manage().window().getSize();
			logger.info("Window Size :: " +size);
			//x position set to mid-screen horizontally
			int width = size.width / 2;
			logger.info("Width of Screen Size :: " + width);
			//Starting y location set to 80% of the height (near bottom)
			int startPoint = (int) (size.getHeight() * 0.80);
			logger.info("Start Point :: "+startPoint);
			//Ending y location set to 20% of the height (near top)
			int endPoint = (int) (size.getHeight() * 0.20);
			logger.info("End Point :: "+endPoint);
			action.press(PointOption.point(width,startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width,endPoint)).release().perform();

			ExtentLogger.info(elementNameForReport + " Scrolled successfully using :: " + by+ " and " + by1 );
			logger.info(elementNameForReport + " Scrolled successfully using :: " + by+ " and " + by1 );

		}catch (Exception e){
			ExtentLogger.fail(elementNameForReport + " Unable to Scroll using " + by+ " and " + by1 );
			logger.error(elementNameForReport + " Unable to Scroll using " + by+ " and " + by1 );

		}

	}

	protected boolean isAllElementsEmpty(By by) {
		return DriverManager.getDriver().findElements(by).isEmpty();
	}

	protected int getAllElementsEmpty(By by) {
		return DriverManager.getDriver().findElements(by).size();
	}
	
	protected boolean isStringContains(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().contains(value);
	}
	
	protected boolean isStringEquals(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().equals(value);
	}
	
	protected boolean isStringEqualsIgnoreCase(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().equalsIgnoreCase(value);
	}
	
	protected void getDropDownValueByVisibleText(By by, String value) {
		getSelectWebElement(by).selectByVisibleText(value);
	}
	
	protected void getDropDownValueByIndex(By by, int index) {
		getSelectWebElement(by).selectByIndex(index);
	}
	
	protected void getDropDownValueByValue(By by, String value) {
		getSelectWebElement(by).selectByValue(value);
	}
	
	protected List<WebElement> getDropDownOptions(By by) {
		return getSelectWebElement(by).getOptions();
	}
	
	protected List<WebElement> getDropDownAllSelectedOptions(By by) {
		return getSelectWebElement(by).getAllSelectedOptions();
	}
	
	protected WebElement getDropDownFirstSelection(By by) {
		return getSelectWebElement(by).getFirstSelectedOption();
	}
	
	protected void deselectDropDownValueByVisibleText(By by, String value) {
		getSelectWebElement(by).deselectByVisibleText(value);
	}
	
	protected void deselectDropDownValueByIndex(By by, int index) {
		getSelectWebElement(by).deselectByIndex(index);
	}
	
	protected void deselectDropDownValueByValue(By by, String value) {
		getSelectWebElement(by).deselectByValue(value);
	}
	
	protected void deselectAllDropDownValueByValue(By by) {
		getSelectWebElement(by).deselectAll();
	}
	
	protected boolean isMultipleSelectionSupported(By by) {
		return getSelectWebElement(by).isMultiple();
	}

}
