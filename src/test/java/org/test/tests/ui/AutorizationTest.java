package org.test.tests.ui;

import org.test.config.BaseUITest;
import org.test.data.Data;
import org.test.steps.LoginSteps;
import org.test.steps.SearchSteps;
import org.testng.annotations.Test;
import utils.InitializationData;
import utils.PagesConstants;

public class AutorizationTest extends BaseUITest {
    AutorizationTest(){
        super(InitializationData.getPages(PagesConstants.loginPage));

    }

    @Test()
    public void login()  {
        LoginSteps loginSteps = new LoginSteps(getDriver());
        loginSteps.executeAuthorization("testuiibank","123456Aa","123456");

    }


}



