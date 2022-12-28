package com.cydeo.tests.day02Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBank {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        String actHeader = driver.findElement(By.tagName("h3")).getText();
        String expHeader = "Log in to ZeroBank";
        if (actHeader.equals(expHeader)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");

        driver.close();



    }
}
/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */