package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By baseLocator = By.xpath("//main[@class='body']");
    private final By loginField = By.xpath(baseLocator + "//input[@id='name']");

    private final By passwordField = By.xpath(baseLocator +"//input[@id='password']");

    private final By loginButton = By.xpath(baseLocator +"//input[@id='kc-login']");

    private final By otpCodeField = By.xpath(baseLocator +"//input[@id='otp']");

    @Override
     void waitPageLoaded(By locator) {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.presenceOfElementLocated(loginField));
    }


    public void fillLoginAndPasswordField(String login, String password){

        WebElement loginFieldElement = driver.findElement(loginField);
        loginFieldElement.sendKeys(login);


        WebElement passwordFieldElement =driver.findElement(passwordField);
        passwordFieldElement.sendKeys(password);
    }

    public void clickOnLoginButton (){
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }
    public void fillCodeField(String code){

        WebElement otpCodeFieldElement = driver.findElement(otpCodeField);
        otpCodeFieldElement.sendKeys(code);

    }




}
