package org.test.tests.ui;

import org.test.data.Data;
import org.test.steps.LoginSteps;
import org.test.steps.SearchSteps;
import org.testng.annotations.Test;
import utils.InitializationData;
import utils.PagesConstants;

public class AutorizationTest extends BaseUITest {

    public AutorizationTest() {
        super(InitializationData.getPages(PagesConstants.home));
    }

    @Test(dataProvider = "searchQuery", dataProviderClass = Data.UIData.class)
    public void login(String text) {
       LoginSteps steps = new LoginSteps(getDriver());

    }
}
