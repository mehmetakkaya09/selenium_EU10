package com.cydeo.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BeforeMethodUtil {


    public WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        implicitSeconds(10);
    }

    @AfterMethod
    public void tearDown() {
        //drive.quit();
    }

    public void implicitSeconds(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
    }


}
