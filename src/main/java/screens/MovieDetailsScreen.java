package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Package name PACKAGE_NAME
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class MovieDetailsScreen extends BaseScreen {

  private WebElement rate_it() {
    return driver.findElement(By.xpath("//android.widget.Button[1]"));
  }

  private WebElement rating_bar() {
    return driver.findElement(By.xpath("//android.widget.RatingBar[1]"));
  }

  private WebElement save_your_rate() {
    return driver.findElement(By.xpath("//android.widget.Button[1]"));
  }

  public void click_rate_it() {
    rate_it().click();
  }

  public void select_rating() {
    rating_bar().click();
  }

  public void save_rating() {
    save_your_rate().click();
  }
}
