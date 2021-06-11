package org.test.tests.ui;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public abstract class BaseUITest {
    private WebDriver driver;


    @BeforeClass()
    public void setUp() {

        System.setProperty("headless", "false"); // You can set this property elsewhere
        System.setProperty("webdriver.chrome.whitelistedIps", "");

        System.setProperty("webdriver.chrome.driver", "E:\\Project\\tests\\src\\test\\java\\resources\\chromedriver.exe");
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if ("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }

    @AfterClass()
    public void tearDown() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    @AfterMethod()
    public void goBack() {
        driver.navigate().back();
    }
    public WebDriver getDriver(){
        return driver;
    }


}
