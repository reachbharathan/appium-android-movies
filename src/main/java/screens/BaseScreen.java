package screens;

import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.AppiumFactory;
import utils.PropertyFactory;

import java.util.Properties;

public class BaseScreen {

  public static AppiumDriver driver = null;
  public static Properties property = null;
  public static Logger LOGGER = null;

  public BaseScreen() {
    LOGGER = LogManager.getLogger(BaseScreen.class);
    LOGGER.info("Base Screen Started");
  }

  public void setDriver() {

    LOGGER.info("Setting up of driver in BaseScreen");
    driver = AppiumFactory.getDriver();
  }

  public void launchApp() {
    driver.launchApp();
  }

  public void closeApp() {
    driver.closeApp();
  }

  public void setProperty() {

    LOGGER.info("Setting up of property in BaseScreen");
    property = PropertyFactory.getProperty();
  }
}