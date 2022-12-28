package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeStart {
    public static WebDriver chromeStart(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
