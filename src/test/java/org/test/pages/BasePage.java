package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public abstract class BasePage {

    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;
    protected WebDriver driver;
    private WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }
    protected void assertElementContainsText(By locator,String expectedText) {
        WebElement element = driver.findElement(locator);
        assertThat(element.isDisplayed()).as("Element has not been displayed").isTrue();
        assertThat(element.getText()).as("Wrong text has been displayed!").containsIgnoringCase(expectedText);
    }

    protected void assertElementContainsProperAttributeText(By locator,String expectedText) {
        WebElement element = driver.findElement(locator);
        assertThat(element.getAttribute("class")).as("Wrong attribute text!").containsIgnoringCase(expectedText);

    }
    abstract void waitPageLoaded(By locator);
}