package com.cydeo.tests.day02Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTask1 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        // we must assign driver ELEMENTS to WebElement class/dataType!!!!!!
        abTestLink.click();
        String actualAbTitle = driver.getTitle();
        String expectedTitle = "No A/B Test";
        if (actualAbTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");
        driver.navigate().back();
        actualAbTitle = driver.getTitle();
        System.out.println(actualAbTitle);
        expectedTitle = "Practice";
        if (actualAbTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");
        driver.quit();








    }
}
