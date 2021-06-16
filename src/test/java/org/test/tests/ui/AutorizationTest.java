package org.test.tests.ui;

import org.test.steps.LoginSteps;
import org.testng.annotations.Test;
import utils.InitializationData;
import utils.PagesConstants;

public class AutorizationTest extends BaseUITest {

    public AutorizationTest() {
        super(InitializationData.getPages(PagesConstants.loginPage));
    }

    @Test()
    public void login() throws InterruptedException {
       LoginSteps steps = new LoginSteps(getDriver());

       steps.executeFillLoginAndPasswordField("testuiibank","123456Aa");
       steps.executeClickOnLoginButton();
       steps.executeFillCodeField("123456");
       steps.executeClickOnLoginButton();
       Thread.sleep(10000);

    }
}
