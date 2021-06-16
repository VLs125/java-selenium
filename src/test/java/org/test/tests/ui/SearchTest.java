package org.test.tests.ui;

import org.test.config.BaseUITest;
import org.test.data.Data;
import org.test.steps.SearchSteps;
import org.testng.annotations.Test;
import utils.InitializationData;
import utils.PagesConstants;

public class SearchTest extends BaseUITest {

    SearchTest(){
        super(InitializationData.getPages(PagesConstants.home));
    }

    @Test(dataProvider = "searchQuery", dataProviderClass = Data.UIData.class)
    public void openGoogleComInChromeTest(String text)  {

       SearchSteps steps = new SearchSteps(getDriver());
        steps.executeSearchByKeyword(text).verifyThatTopResultContainsCorrectText();


    }

}

