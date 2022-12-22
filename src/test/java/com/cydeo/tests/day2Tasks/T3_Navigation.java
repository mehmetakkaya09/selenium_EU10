package com.cydeo.tests.day2Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Navigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();
        String exTitle1 = "Gmail";
        String actTitle1 = driver.getTitle();
        if (actTitle1.contains(exTitle1)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");

        driver.navigate().back();

        String exTitle2 = "Google";
        String actTitle2 = driver.getTitle();
        if (exTitle2.equals(actTitle2)){
            System.out.println("Passed");
        }else
            System.out.println("Failed;");
        driver.close();

    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */