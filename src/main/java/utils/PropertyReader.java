package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Package name java
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class PropertyReader {

  Properties property;

  public PropertyReader() {
    property = new Properties();
    loadProperty();
  }

  public void loadProperty() {
    FileInputStream propertyPath = null;
    try {
      propertyPath = new FileInputStream("src/testSuite/resources/config.property");
      property.load(propertyPath);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getProperty(String key) {
    return property.getProperty(key);
  }
}
