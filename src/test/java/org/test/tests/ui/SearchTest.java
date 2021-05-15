package org.test.tests.ui;

import org.test.data.Data;
import org.test.pages.SearchPage;
import org.test.pages.SearchResultsPage;
import org.testng.annotations.Test;

public class SearchTest extends BaseUITest{


    @Test(dataProvider ="searchQuery",dataProviderClass = Data.UIData.class)
        public void openGoogleComInChromeTest (String text) throws InterruptedException {

            SearchPage searchPage = new SearchPage();
            SearchResultsPage searchResultsPage = new SearchResultsPage();

            searchPage.fillSearchField(text);
            searchPage.pressEnter();
            searchResultsPage.waitResultPageLoaded();
            searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb");
            searchResultsPage.assertThatTopResultContainsCorrectText("Selenium WebDriver");

        }

}

