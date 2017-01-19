package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Package name PACKAGE_NAME
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class SearchScreen extends BaseScreen {

  private WebElement gener() {
    return driver.findElement(By.xpath("//android.widget.Button[1]"));
  }
  private WebElement first_movie() {
    return driver.findElement(By.xpath("//android.widget.RelativeLayout[1]"));
  }

  private WebElement first_movie_title() {
    return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.TextView[1]"));
  }

  private WebElement search_movie() {
    return driver.findElement(By.xpath("//android.widget.EditText[1]"));
  }

  public void click_first_movie() {
    first_movie().click();
  }

  public void search_movie(String movieName) {
    search_movie().sendKeys(movieName);
  }

  public void verify_first_movie_title(String movieName) {
    Assert.assertEquals(first_movie_title().getText(), movieName);
  }
}
