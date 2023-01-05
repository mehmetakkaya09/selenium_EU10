package com.cydeo.tests.day05Tasks;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task01 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/add_remove_elements/");
    }

    @AfterMethod
    public void close() {
        driver.close();
    }

    @Test
    public void practice() {
        WebElement addButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addButton.click();
        System.out.println(addButton.isDisplayed());
        WebElement deleteBtn = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println(deleteBtn.isDisplayed());
        deleteBtn.click();

        try {
            System.out.println(deleteBtn.isDisplayed());
        } catch (Exception e) {
            System.out.println("deleteBtn.isDisplayed() : false" );
        }

    }
}
