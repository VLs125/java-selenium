package org.test.steps;

import org.openqa.selenium.WebDriver;
import org.test.pages.SearchPage;

public class SearchSteps extends SearchPage {


    public SearchSteps(WebDriver driver){
        super(driver);
    }

    private final SearchPage searchPage = new SearchPage(driver);



    public SearchResultSteps executeSearchByKeyword(String keyword){
      searchPage.fillSearchField(keyword);
      searchPage.pressEnter();
      return new SearchResultSteps(driver);

  }

}
