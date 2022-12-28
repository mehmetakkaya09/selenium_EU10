package com.cydeo.tests.day03Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
        WebElement login = driver.findElement(By.cssSelector("input[class='login-inp']"));
        login.sendKeys("incorrect");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("incorrect");
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn'" ));
        loginButton.click();
        String actIncorrect = driver.findElement(By.cssSelector("div[class='errortext']")).getText();
        String expIncorrect = "Incorrect login or password";
        if (actIncorrect.equals(expIncorrect)){
            System.out.println("PASSED");
        }else
            System.out.println("FAILED");
        driver.close();



    }
}
