package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Package name PACKAGE_NAME
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class SearchScreen extends BaseScreen {

  private WebElement first_movie() {
    WebElement element= driver.findElement(By.xpath("//android.widget.RelativeLayout[1]"));
    return element;
  }

  public void click_first_movie() {
    first_movie().click();
  }
}
