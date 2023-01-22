package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2Upload {

    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/upload");
        WebElement choose = driver.findElement(By.xpath("//input[@id='file-upload']"));
        choose.sendKeys("C:\\Users\\Asus\\Desktop\\html Quiz bugs.png");
        WebElement upload = driver.findElement(By.xpath("//input[@id='file-submit']"));
        upload.click();
        WebElement verify = driver.findElement(By.id("uploaded-files"));
        Assert.assertTrue(verify.isDisplayed());
        driver.quit();

    }




}
