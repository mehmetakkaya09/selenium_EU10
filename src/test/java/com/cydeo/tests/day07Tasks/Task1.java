package com.cydeo.tests.day07Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import com.cydeo.utility.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 extends BeforeMethodUtil {
    @Test
    public void test1() {
        driver().get("https://www.amazon.com");
        ((JavascriptExecutor) driver()).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver()).executeScript("window.open('http://facebook.com','_blank');");
        ((JavascriptExecutor) driver()).executeScript("window.open('http://etsy.com','_blank');");

        BrowserUtils.switchWindow(driver(), "etsy");
        Assert.assertTrue(driver().getTitle().contains("Etsy"), "false");

    }
}
