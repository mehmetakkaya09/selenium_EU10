package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4Scroll {

    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/");
        Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
    //actions.sendKeys(Keys.END).perform();
       actions.moveToElement(driver.findElement(By.xpath("//a[.='Infinite Scroll']"))).perform();
        driver.quit();
//
    }


}
