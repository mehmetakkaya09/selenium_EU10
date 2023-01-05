package com.cydeo.tests.day05Tasks;

import com.cydeo.utility.ChromeStart;
import com.cydeo.utility.RadioUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task02 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void radio() {
        WebElement hockey = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockey.click();
        Assert.assertTrue(hockey.isSelected());
        RadioUtility.clickAndVerifyRadioButton(driver,"color","Red");






    }



}
