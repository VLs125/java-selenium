package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver){
        super(driver);
    }
    BasePage basePage;

    private final By searchField = By.name("q");

    private WebElement searchFieldElement = driver.findElement(searchField);

    public void fillSearchField (String text){
        searchFieldElement.click();
        searchFieldElement.sendKeys(text);

    }

    public void pressEnter (){
        searchFieldElement.sendKeys(Keys.ENTER);

    }
}
