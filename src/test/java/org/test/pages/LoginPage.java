package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By loginField = By.xpath("//input[@id='name']");

    private final By passwordField = By.xpath("//input[@id='password']");

    private final By loginButton = By.xpath("//input[@id='kc-login']");


    public void fillLoginAndPasswordField(String login, String password){
        waitForElementToAppear(loginField);
        WebElement loginFieldElement = driver.findElement(loginField);
        loginFieldElement.sendKeys(login);

        waitForElementToAppear(passwordField);
        WebElement passwordFieldElement =driver.findElement(passwordField);
        passwordFieldElement.sendKeys(password);

    }


    public void clickOnLoginButton (String text){
        waitForElementToAppear(loginButton);
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();

    }


}
