package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4Scroll {

    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
//        actions.moveToElement(driver.findElement(By.xpath("//div[normalize-space(text())='Powered by']")), 0, 5).perform();
        driver.quit();

    }


}
