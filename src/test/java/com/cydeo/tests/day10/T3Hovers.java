package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3Hovers {
    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/hovers");
        WebElement avatar1 = driver.findElement(By.xpath("//h5[.='name: user1']/../../img"));
        Actions action = new Actions(driver);
        action.moveToElement(avatar1).perform();
        WebElement name1 = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(name1.isDisplayed());
        WebElement avatar2 = driver.findElement(By.xpath("//h5[.='name: user2']/../../img"));
        action.moveToElement(avatar2).perform();
        WebElement name2 = driver.findElement(By.xpath("//h5[.='name: user2']"));
        Assert.assertTrue(name2.isDisplayed());
        WebElement avatar3 = driver.findElement(By.xpath("//h5[.='name: user3']/../../img"));
        action.moveToElement(avatar3).perform();
        WebElement name3 = driver.findElement(By.xpath("//h5[.='name: user3']"));
        Assert.assertTrue(name3.isDisplayed());
        driver.quit();
    }
}
