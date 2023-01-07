package com.cydeo.tests.day04;

import com.cydeo.utility.ChromeStart;
import com.cydeo.utility.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/multiple_buttons");
        WebElement button1= driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();
        String actualText = driver.findElement(By.xpath("//p[.='Clicked on button one!']")).getText();
        String expectedText = "Clicked on button one!";
        StringUtility.equalsTexts(actualText,expectedText);
       driver.close();

    }
}
