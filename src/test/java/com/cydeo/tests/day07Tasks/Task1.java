package com.cydeo.tests.day07Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import com.cydeo.utility.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class Task1 extends BeforeMethodUtil {
    @Override
    public void test1() {
        getDriver().get("https://www.amazon.com");
        ((JavascriptExecutor) getDriver()).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) getDriver()).executeScript("window.open('http://facebook.com','_blank');");
        ((JavascriptExecutor) getDriver()).executeScript("window.open('http://etsy.com','_blank');");

        BrowserUtils.switchWindow(getDriver(),"etsy");
        Assert.assertTrue(getDriver().getTitle().contains("Etsy"), "false");

    }
}
