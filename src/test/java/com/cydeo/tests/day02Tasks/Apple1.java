package com.cydeo.tests.day02Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement searchButton = driver.findElement(By.name("q"));

        searchButton.sendKeys("apple" + Keys.ENTER);

        String expSearchTitle = "apple";
        String actualSearchTitle = driver.getTitle();
        if (actualSearchTitle.startsWith(expSearchTitle)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");


    }
}
