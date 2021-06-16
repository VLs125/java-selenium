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
    private final By baseLocator = By.xpath("//div[@class='container']");
    private final By loginField = By.xpath("//input[@id='name']");
    private final By passwordField = By.xpath("//input[@id='password']");
    private final By loginButton = By.xpath("//input[@id='kc-login']");
    private final By otpCodeField = By.xpath("//input[@id='otp']");

    @Override
     void waitPageLoaded(By locator) {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    public void fillLoginAndPasswordField(String login, String password){
        waitPageLoaded(loginField);
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
        waitPageLoaded(otpCodeField);
        WebElement otpCodeFieldElement = driver.findElement(otpCodeField);
        otpCodeFieldElement.sendKeys(code);

    }




}
