package com.cydeo.tests.day04;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Xpath_css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement home = driver.findElement(By.xpath("//a[@class=\"nav-link\"]"));
        home.click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.close();



    }


}
