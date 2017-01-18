package testSuite;

import org.testng.annotations.Test;

public class MovieAppTest extends BaseTest {

  @Test
  public void verifyAddRatingForMoviesApp() {
    searchScreen.click_first_movie();
    movieDetailsScreen.click_rate_it();
    movieDetailsScreen.select_rating();
    movieDetailsScreen.save_rating();
  }
}
