package org.test.tests.ui;


import org.openqa.selenium.WebDriver;
import org.test.util.DriverInitializer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {
    private WebDriver driver;

    BaseTest(){
        this.driver = DriverInitializer.initialize();
    }

    @BeforeClass()
    public void setUp(){

        driver.get("https://www.google.com/");
                }

@AfterClass()
public void tearDown(){
        driver.close();
        driver.quit();
        }
@AfterMethod()
public void goBack(){
        driver.navigate().back();
        }


        }
