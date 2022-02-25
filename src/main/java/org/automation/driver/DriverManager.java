package org.automation.driver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * This class is responsible in setting and getting the web driver instance.
 * This is done for Thread safety.
 *
 * Class is final to avoid extend.
 *
 * Jan 31, 2022
 * @author Bilal Ikram
 * @version 1.0
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DriverManager {

	private static ThreadLocal<AppiumDriver<MobileElement>> driver = new ThreadLocal<AppiumDriver<MobileElement>>();
	
	/**
	 * Get AppiumDriver<MobileElement> instance
	 *
	 * Jan 31, 2022
	 * @return WebDriver
	 *
	 */
	public static AppiumDriver<MobileElement> getDriver() {
		return driver.get();
	}

	/**
	 * Setup the AppiumDriver<MobileElement>
	 *
	 * Jan 31, 2022
	 * @param driverRef instance variable for ThreadLocal of type AppiumDriver<MobileElement>.
	 *
	 */
	static void setDriver(AppiumDriver<MobileElement> driverRef) {
		driver.set(driverRef);
	}

	/**
	 * Removes the AppiumDriver<MobileElement> instance after execution.
	 *
	 * Jan 31, 2022
	 *
	 */
	static void unload() {
		driver.remove();
	}
}
