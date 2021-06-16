package org.test.steps;

import org.openqa.selenium.WebDriver;
import org.test.pages.SearchResultsPage;

public class SearchResultSteps extends SearchResultsPage {
    SearchResultSteps(WebDriver driver){
        super(driver);
    }

   private final SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

    public SearchResultSteps verifyThatTopResultContainsCorrectText(){
        searchResultsPage.waitResultPageLoaded();
        searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb");
        searchResultsPage.assertThatTopResultContainsCorrectText("Selenium");
        return this;
    }

}
