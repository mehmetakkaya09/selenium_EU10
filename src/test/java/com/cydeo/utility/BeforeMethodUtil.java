package com.cydeo.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BeforeMethodUtil {


    WebDriver drive;

    public WebDriver driver() {
        return drive;
    }

    public void setdrive(WebDriver drive) {
        this.drive = drive;
    }

    @BeforeMethod
    public void setup() {
        drive = ChromeStart.chromeStart();
        drive.manage().window().maximize();
        implicitSeconds(10);
    }

    @AfterMethod
    public void tearDown() {
        //drive.quit();
    }

    public void implicitSeconds(int seconds) {
        drive.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
    }


}
