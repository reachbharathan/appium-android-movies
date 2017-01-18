package screens;

import io.appium.java_client.AppiumDriver;
import utils.AppiumFactory;
import utils.PropertyFactory;

import java.util.Properties;

public class BaseScreen {

  public static AppiumDriver driver=null;
  public static Properties property=null;

  public BaseScreen() {
    System.out.println("Base Screen constructor is executed");
  }

  public void setDriver() {
    driver = AppiumFactory.getDriver();
  }

  public void setProperty() {
    property = PropertyFactory.getProperty();
  }
}