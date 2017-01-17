import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

  public DesiredCapabilities capabilities;
  public AppiumDriver driver;

  @BeforeSuite
  public void suiteSetup() throws MalformedURLException, InterruptedException {
    capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5_API_22");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
// Movies app
    capabilities.setCapability(MobileCapabilityType.APP, "/Users/Bharathan/Library/Android/sdk/tools/BitbarSampleApp.apk");
// Bitbar app
// capabilities.setCapability(MobileCapabilityType.APP,"/Users/Bharathan/Library/Android/sdk/tools/bookingapp.apk.apk");
// Calculator app
// capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
// capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    Thread.sleep(10000);
  }

  //  @Test
  public void verifyAddTestForCalculator() {
    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.Button[2]")).click();
    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[2]/android.widget.Button[5]")).click();
    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.Button[8]")).click();
    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.Button[12]")).click();
    String sumDisplay = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).getText();
    Assert.assertEquals(sumDisplay, "10", "Sum doesn't match");
  }

  @Test
  public void verifyAddRatingForMoviesApp() throws InterruptedException {
    driver.findElement(By.xpath("//android.widget.RelativeLayout[1]")).click();
    driver.findElement(By.xpath("//android.widget.Button[1]")).click();
    driver.findElement(By.xpath("//android.widget.RatingBar[1]")).click();
    driver.findElement(By.xpath("//android.widget.Button[1]")).click();
    Thread.sleep(10000);
  }

  @AfterTest
  public void testTearDown() throws IOException {
    Runtime.getRuntime().exec("adb shell pm clear com.bitbar.movies");
  }

  @AfterSuite
  public void suiteTearDown() throws MalformedURLException {
    driver.quit();
  }
}
