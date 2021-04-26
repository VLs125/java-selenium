package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(){
        super();
    }
//    @FindBy(name ="q")
//    private WebElement searchField;


    private final By searchField = By.name("q");
    WebElement searchFieldElement = driver.findElement(searchField);


    public void fillSearchField (String text){
        searchFieldElement.click();
        searchFieldElement.sendKeys(text);

    }

    public void pressEnter (){
        searchFieldElement.sendKeys(Keys.ENTER);

    }
}
