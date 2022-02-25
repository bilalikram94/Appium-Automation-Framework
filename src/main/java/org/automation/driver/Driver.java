package org.automation.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.log4j.PropertyConfigurator;
import org.automation.appium.AppiumSetup;
import org.automation.appium.ServiceManager;
import org.automation.constants.GlobalVars;
import org.automation.enums.ConfigMap;
import org.automation.utils.PropertyUtils;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * Setup the web driver and removes it at the end of execution. <br>
 * Class is final to avoid extend. <br>
 *
 * Jan 31, 2022
 * 
 * @author Bilal Ikram
 * @version 1.0
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Driver {
	
	/**
	 * Setup the web driver for browser <br>
	 * Jan 31, 2022
	 *
	 */
	public static void initDriver() {
		PropertyConfigurator.configure("src/main/resources/log4j2.properties");
		if (Objects.isNull(DriverManager.getDriver())) {
			URL url = null;
			try {
				DesiredCapabilities cap = new DesiredCapabilities(AppiumSetup.startAppiumServer());
				if (PropertyUtils.get(ConfigMap.RUNMODE).equalsIgnoreCase(GlobalVars.getLocal())) {
					url = new URL(ServiceManager.getService().getUrl().toString());
				} else if (PropertyUtils.get(ConfigMap.RUNMODE).equalsIgnoreCase(GlobalVars.getExistingAppium())) {
					url = new URL(PropertyUtils.get(ConfigMap.REMOTEURL));
				}
				AppiumDriver<MobileElement> driver = new AppiumDriver<>(url, cap);
				DriverManager.setDriver(driver);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			DriverManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	/**
	 * Removes the web driver at the end of execution <br>
	 * Jan 31, 2022
	 *
	 */
	public static void quiteDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
