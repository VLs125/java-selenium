package org.test.tests;
import org.test.pages.SearchPage;
import org.test.pages.SearchResultsPage;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

        @Test(dataProvider ="dataProvider")
        public void openGoogleComInChromeTest (String text) throws InterruptedException {

            SearchPage searchPage = new SearchPage();
            searchPage.fillSearchField(text);
            searchPage.pressEnter();
            Thread.sleep(3000);

            SearchResultsPage searchResultsPage = new SearchResultsPage();

            searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb");
            searchResultsPage.assertThatTopResultContainsCorrectText("Selenium Webdriver");




        }

}

