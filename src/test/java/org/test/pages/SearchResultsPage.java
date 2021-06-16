package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SearchResultsPage extends BasePage {
    private By resultRow = By.xpath("//div[@class='g']//h3");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    void waitPageLoaded(By locator) {

    }

    void waitPageLoaded() {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.presenceOfElementLocated(resultRow));

    }

    public void asser() {

    }
}
