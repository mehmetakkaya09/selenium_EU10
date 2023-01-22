package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7ScrollArguments {

    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/large");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement cydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        WebElement home = driver.findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[0].scrollIntoView(true)",cydeo);
        js.executeScript("arguments[0].scrollIntoView(true)",home);
        driver.quit();
    }

}
