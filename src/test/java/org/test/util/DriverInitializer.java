package org.test.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverInitializer {

    private static final WebDriver driver = new ChromeDriver();

    private static WebDriver getDriver() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver initialize() {
        File file = new File("src/test/java/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        return getDriver();
    }

}

