package org.test.tests.ui;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.test.steps.SearchSteps;
import org.test.util.PropertyReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public abstract class BaseUITest {
    private WebDriver driver;
    private String page;
    BaseUITest(String page){
        this.page = page;

    }

    @BeforeClass()
    public void setUp() {
        System.setProperty("headless", "false"); // You can set this property elsewhere
        System.setProperty("webdriver.chrome.whitelistedIps", "");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if ("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
<<<<<<< HEAD
        driver.get("https://www.google.com/");

=======
        driver.get(page);
>>>>>>> 525e3de8c051e2a253e8bd67d2471e39dce22d35

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

    public WebDriver getDriver() {
        return driver;
    }


}
