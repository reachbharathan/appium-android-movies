package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Package name PACKAGE_NAME
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class PropertyFactory {

  private static Properties property;

  private PropertyFactory(){
    property = new Properties();
    loadProperty();
  }

  public static Properties getProperty() {
    if (property == null) {
      new PropertyFactory();
    }
    return property;
  }

  public void loadProperty() {
    FileInputStream propertyPath = null;
    try {
      propertyPath = new FileInputStream("src/test/resources/config.properties");
      property.load(propertyPath);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
