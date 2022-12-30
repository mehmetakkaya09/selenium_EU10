package com.cydeo.tests.day04;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5 {
    public static void main(String[] args) {

        WebDriver driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement check1 = driver.findElement(By.xpath("//input[@id='box1']"));
        WebElement check2 = driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println(check1.isSelected());
        check1.click();
        System.out.println(check1.isSelected());
        System.out.println(check2.isSelected());
        check2.click();
        System.out.println(check2.isSelected());
        System.out.println(check2.isDisplayed());

        driver.quit();


    }
}
