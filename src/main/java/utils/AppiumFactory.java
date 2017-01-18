package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * Package name PACKAGE_NAME
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class AppiumFactory {

  private static AppiumDriver driver;
  public Properties property;

  private AppiumFactory() {
    property = PropertyFactory.getProperty();
    setDriver();
  }

  public static AppiumDriver getDriver() {
    if (driver == null) {
      new AppiumFactory();
    }
    return driver;
  }

  public void setDriver() {
    DesiredCapabilities capabilities;
    capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, property.getProperty("DEVICE_NAME"));
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, property.getProperty("PLATFORM_NAME"));
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, property.getProperty("PLATFORM_VERSION"));
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, property.getProperty("AUTOMATION_NAME"));
// Movies app
    capabilities.setCapability(MobileCapabilityType.APP, property.getProperty("APP"));
    try {
      driver = new AndroidDriver(new URL(property.getProperty("ANDROID_HUB_URL")), capabilities);
      Thread.sleep(10000);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void quitDriver(){
    driver.quit();
    driver=null;
  }
}
