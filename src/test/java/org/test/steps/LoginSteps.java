package org.test.steps;

import org.openqa.selenium.WebDriver;
import org.test.pages.LoginPage;

public class LoginSteps extends LoginPage {

    public LoginSteps(WebDriver driver) {
        super(driver);
    }
    private final LoginPage loginPage = new LoginPage(driver);

    public void executeFillLoginAndPasswordField(String login, String password){

        loginPage.fillLoginAndPasswordField(login,password);

    }
    public void executeClickOnLoginButton(){

        loginPage.clickOnLoginButton();
    }
    public LoginSteps executeFillCodeField(String code){
        loginPage.fillCodeField(code);
        return this;

    }
}
