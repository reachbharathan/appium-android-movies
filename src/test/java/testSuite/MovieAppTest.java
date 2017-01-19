package testSuite;

import org.testng.annotations.Test;

public class MovieAppTest extends BaseTestConfiguration {

  @Test
  public void verifyAddRatingForMoviesApp() {
    searchScreen.click_first_movie();
    movieDetailsScreen.click_rate_it();
    movieDetailsScreen.select_rating();
    movieDetailsScreen.save_rating();
  }

  @Test
  public void verifySearchMovies() {
    searchScreen.search_movie("fast");
    searchScreen.verify_first_movie_title("Fast and Furious");
  }
}
