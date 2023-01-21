package com.cydeo.tests.day02Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        String expected = "Facebook - Giriş Yap veya Kaydol";
        String actual = driver.getTitle();


        if (actual.equals(expected)) {
            System.out.println("Passed");
        } else
            System.out.println("Failed");
        driver.quit();
        driver=null;
    }
}
/*
TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - Log In or Sign Up”
 */