package org.test.elements;

import org.openqa.selenium.WebDriver;

public abstract class BaseElements {
    private final WebDriver driver;
    public BaseElements(WebDriver driver) {
        this.driver = driver;
    }
}
