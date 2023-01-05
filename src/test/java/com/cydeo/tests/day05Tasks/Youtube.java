package com.cydeo.tests.day05Tasks;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Youtube {
    public static void main(String[] args) {
        WebDriver driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
        WebElement settingsButton = driver.findElement(By.xpath("//yt-formatted-string[.='Settings']"));
        settingsButton.click();
    }
}
