package org.test.tests.ui;

import utils.InitializationData;
import utils.PagesConstants;

public class HomeTest extends BaseUITest {
    public HomeTest(String pages) {
        super(InitializationData.getPages(PagesConstants.loginPage));
    }
}
