package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchResultsPage extends BasePage {
    private By resultRow = By.xpath("//div[@class='g']//h3");

    public SearchResultsPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expectedText) {
        WebElement resultRowElement = driver.findElement(resultRow);
        assertThat(resultRowElement.isDisplayed()).as("Element has not been displayed").isTrue();
        assertThat(resultRowElement.getText()).as("Wrong text has been displayed!").containsIgnoringCase(expectedText);
    }

    public void assertThatTopResultContainsProperAttributeText(String expectedText) {
        WebElement resultRowElement = driver.findElement(resultRow);
        assertThat(resultRowElement.getAttribute("class")).as("Wrong attribute text!").containsIgnoringCase(expectedText);


    }
}