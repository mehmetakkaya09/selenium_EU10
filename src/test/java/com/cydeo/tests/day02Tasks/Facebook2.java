package com.cydeo.tests.day02Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("efsdf");
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("adsas");
        WebElement enter = driver.findElement(By.name("login"));
        enter.click();
        Thread.sleep(1000);

        String expected = "Facebook'a Giriş Yap";
        String actual = driver.getTitle();
        System.out.println(actual);


        if (actual.equals(expected)) {
            System.out.println("Passed");
        } else
            System.out.println("Failed");
        driver.quit();
        driver=null;
    }
}
/*
TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
 */