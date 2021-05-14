package org.test.pages;

import org.openqa.selenium.WebDriver;
import org.test.util.DriverInitializer;

public class BasePage {
  public WebDriver driver;

    public BasePage() {
        DriverInitializer driverInitializer = new DriverInitializer();
        this.driver = driverInitializer.initialize();
    }
}
