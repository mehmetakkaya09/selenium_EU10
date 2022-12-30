package com.cydeo.tests.day04;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task6 {
    public static void main(String[] args) {
        WebDriver driver= ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest");
        WebElement cydeo = driver.findElement(By.cssSelector("a[target='_blank']"));
        System.out.println("cydeo.isDisplayed() = " + cydeo.isDisplayed());
        driver.navigate().refresh();
        cydeo = driver.findElement(By.cssSelector("a[target='_blank']"));
        System.out.println("cydeo.isDisplayed() = " + cydeo.isDisplayed());
        driver.quit();
    }
}
