package com.cydeo.tests.day05Tasks;

import com.cydeo.utility.RadioSelectUtility;
import com.cydeo.utility.RadioUtility;
import com.cydeo.utility.WaitUtility;
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
