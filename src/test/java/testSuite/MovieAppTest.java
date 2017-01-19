package testSuite;

import org.testng.annotations.Test;

public class MovieAppTest extends BaseTestConfiguration {

  @Test
  public void verifyAddRatingForMoviesApp() {
    System.out.println("verifyAddRatingForMoviesApp");
    searchScreen.click_first_movie();
    movieDetailsScreen.click_rate_it();
    movieDetailsScreen.select_rating();
    movieDetailsScreen.save_rating();
  }

  @Test
  public void simpleSecondTest() {
    System.out.println("simpleSecondTest");
    searchScreen.click_first_movie();
  }
}
