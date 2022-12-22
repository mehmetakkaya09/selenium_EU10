package com.cydeo.tests.day2Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GetAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

        String expected= "Registration form";
        String actual = driver.findElement(By.className("page-header")).getText();
        if (actual.equals(expected)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");


        expected= "first name";
        actual=driver.findElement(By.name("firstname")).getAttribute("placeholder");



        if (actual.equals(expected)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");

        driver.quit();






    }
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
 */