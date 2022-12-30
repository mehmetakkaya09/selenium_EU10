package com.cydeo.tests.day04;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver= ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
            System.out.println(webElement.getAttribute("href"));
        }
        System.out.println(list.size());

        driver.close();
    }
}
