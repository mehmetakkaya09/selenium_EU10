package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");

        RadioUtility.clickAndVerifyRadioButton(driver, "sport", "water_polo");
        WaitUtility.waitSeconds(2.5);
        RadioSelectUtility.clickAndVerifyRadioButton(driver, "color", "red");
        WaitUtility.waitSeconds(2);
        RadioSelectUtility.clickAndVerifyRadioButton(driver, "sport", "football");
        WaitUtility.waitSeconds(2);
        RadioSelectUtility.clickAndVerifyRadioButton(driver, "color", "black");




    }

}
