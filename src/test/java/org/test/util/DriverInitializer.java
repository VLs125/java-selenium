package org.test.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverInitializer {

    private static final WebDriver driver = new ChromeDriver();

    private static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver initialize() {
        File file = new File("src/test/java/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        return getDriver();
    }

}

