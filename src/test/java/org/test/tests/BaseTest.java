package org.test.tests;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.test.pages.BasePage;
import org.test.util.DriverInitializer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static org.test.util.DriverInitializer.getDriver;


public abstract class BaseTest {

WebDriver driver = getDriver();

    @BeforeClass
    public void setUp(){

        driver.get("https://www.google.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @AfterMethod
    public void goBack(){
        driver.navigate().back();
    }

    @DataProvider(name = "dataProvider")
    public Object [][] dataProviderMethod(){

        return new Object[][]{{"selenium java"},{"selenium javascript"}};

    }
}
