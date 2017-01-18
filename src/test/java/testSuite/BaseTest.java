package testSuite;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import screens.BaseScreen;
import screens.MovieDetailsScreen;
import screens.SearchScreen;
import utils.AppiumFactory;
import utils.PropertyFactory;
import utils.ShellExecution;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {

  public BaseScreen baseScreen;
  public SearchScreen searchScreen;
  public MovieDetailsScreen movieDetailsScreen;
  public AppiumDriver baseTestDriver;
  public Properties baseTestProperty;

  public BaseTest() {
    this.baseScreen = new BaseScreen();
    this.searchScreen = new SearchScreen();
    this.movieDetailsScreen = new MovieDetailsScreen();
  }

  @BeforeSuite
  public void suiteSetup() {
    baseScreen.setProperty();
    baseScreen.setDriver();
    baseTestProperty = PropertyFactory.getProperty();
    baseTestDriver = AppiumFactory.getDriver();
  }

  @AfterTest
  public void testTearDown() throws IOException {
    ShellExecution.clearAppData();
  }

  @AfterSuite
  public void suiteTearDown() {
    AppiumFactory.quitDriver();
  }
}
