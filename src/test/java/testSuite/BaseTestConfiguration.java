package testSuite;

import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import screens.BaseScreen;
import screens.MovieDetailsScreen;
import screens.SearchScreen;
import utils.AppiumFactory;
import utils.PropertyFactory;
import utils.ShellExecution;

import java.io.IOException;
import java.util.Properties;
;

public class BaseTestConfiguration {
  private static Logger LOGGER = null;
  public BaseScreen baseScreen;
  public SearchScreen searchScreen;
  public MovieDetailsScreen movieDetailsScreen;
  public AppiumDriver baseTestDriver;
  public Properties baseTestProperty;

  public BaseTestConfiguration() {
    LOGGER=LogManager.getLogger(BaseTestConfiguration.class);
    LOGGER.debug("Base test started");
    this.baseScreen = new BaseScreen();
    this.searchScreen = new SearchScreen();
    this.movieDetailsScreen = new MovieDetailsScreen();
  }

  @BeforeSuite
  public void suiteSetup() {
    LOGGER.debug("Before suite started");
    System.out.println("Before suite started");
    baseScreen.setProperty();
    baseScreen.setDriver();
    baseTestProperty = PropertyFactory.getProperty();
    baseTestDriver = AppiumFactory.getDriver();
  }

  @BeforeMethod
  public void testSetup() {
    LOGGER.debug("Before test started");
    System.out.println("Before test started");
    baseScreen.launchApp();
  }

  @AfterMethod
  public void tesxdsftTearDown() throws IOException {
    LOGGER.debug("after test started");
    System.out.println("after test started");
    baseScreen.closeApp();
    ShellExecution.clearAppData();
  }

  @AfterSuite
  public void suiteTearDown() {
    LOGGER.debug("After suite started");
    System.out.println("After suite started");
    AppiumFactory.quitDriver();
  }
}
