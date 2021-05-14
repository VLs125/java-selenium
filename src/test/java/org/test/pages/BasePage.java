package org.test.pages;

import org.openqa.selenium.WebDriver;
        import org.test.util.DriverInitializer;

public class BasePage {
    public WebDriver driver;


    public BasePage() {
        this.driver = DriverInitializer.initialize();
    }
}
