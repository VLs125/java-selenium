package org.test.tests.ui;

import org.test.data.Data;
import org.test.pages.SearchPage;
import org.test.pages.SearchResultsPage;
import org.test.steps.SearchSteps;
import org.testng.annotations.Test;

public class SearchTest extends BaseUITest {


    @Test(dataProvider = "searchQuery", dataProviderClass = Data.UIData.class)
    public void openGoogleComInChromeTest(String text) throws InterruptedException {

       SearchSteps steps = new SearchSteps(getDriver());
        steps.executeSearchByKeyword(text).verifyThatTopResultContainsCorrectText();

//        SearchPage searchPage = new SearchPage(getDriver());
//        searchPage.fillSearchField(text);
//        searchPage.pressEnter();
//
//        SearchResultsPage searchResultsPage = new SearchResultsPage(getDriver());
//        searchResultsPage.waitResultPageLoaded();
//        searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb");
//        searchResultsPage.assertThatTopResultContainsCorrectText("Selenium WebDriver");

    }

}

