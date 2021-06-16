package org.test.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){
        super(driver);
    }

    private final By searchField = By.name("q");

    private final WebElement searchFieldElement = driver.findElement(searchField);

    public void fillSearchField (String text){
        waitForElementToAppear(searchField);
        searchFieldElement.click();
        searchFieldElement.sendKeys(text);

    }

    public void pressEnter (){
        searchFieldElement.sendKeys(Keys.ENTER);

    }
}
