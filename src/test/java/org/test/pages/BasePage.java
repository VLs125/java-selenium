package org.test.pages;

import org.openqa.selenium.WebDriver;

import static org.test.util.DriverInitializer.getDriver;

public abstract class BasePage {
  public WebDriver driver;

    public BasePage() {
        this.driver = getDriver();
    }
}
