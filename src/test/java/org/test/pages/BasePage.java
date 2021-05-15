package org.test.pages;

import org.openqa.selenium.WebDriver;
        import org.test.util.DriverInitializer;

class BasePage {
    WebDriver driver;


    BasePage() {
        this.driver = DriverInitializer.initialize();
    }
}
