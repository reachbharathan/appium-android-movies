package testSuite;

import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import screens.BaseScreen;
import screens.MovieDetailsScreen;
import screens.SearchScreen;
import utils.AppiumFactory;
import utils.PropertyFactory;
import utils.ShellExecution;

import java.io.IOException;
import java.util.Properties;
;

public class BaseTest {
  private static Logger LOGGER = null;
  public BaseScreen baseScreen;
  public SearchScreen searchScreen;
  public MovieDetailsScreen movieDetailsScreen;
  public AppiumDriver baseTestDriver;
  public Properties baseTestProperty;

  public BaseTest() {
    LOGGER = LogManager.getLogger(BaseTest.class);
    LOGGER.debug("Base test started");
    this.baseScreen = new BaseScreen();
    this.searchScreen = new SearchScreen();
    this.movieDetailsScreen = new MovieDetailsScreen();
  }

  @BeforeSuite
  public void suiteSetup() {
    LOGGER.debug("Before suite started");
    baseScreen.setProperty();
    baseScreen.setDriver();
    baseTestProperty = PropertyFactory.getProperty();
    baseTestDriver = AppiumFactory.getDriver();
  }

  @BeforeTest
  public void testSetup() {
    LOGGER.debug("Before test started");
    baseScreen.launchApp();
  }

  @AfterTest
  public void testTearDown() throws IOException {
    LOGGER.debug("after test started");
    baseScreen.closeApp();
    ShellExecution.clearAppData();
  }

  @AfterSuite
  public void suiteTearDown() {
    LOGGER.debug("After suite started");
    AppiumFactory.quitDriver();
  }
}
