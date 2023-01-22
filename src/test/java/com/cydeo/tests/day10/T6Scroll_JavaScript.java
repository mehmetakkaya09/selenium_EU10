package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import com.cydeo.utility.WaitUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class T6Scroll_JavaScript {
    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0;i<10;i++) {
            WaitUtility.waitSeconds(1);
            js.executeScript("window.scrollBy(0,750)");
        }
        for (int i = 0;i<10;i++) {
            WaitUtility.waitSeconds(1);
            js.executeScript("window.scrollBy(0,-750)");
        }
driver.quit();
    }





}
