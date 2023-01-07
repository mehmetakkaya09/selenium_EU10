package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioSelectUtility {
    String name111;


    public static void clickAndVerifyRadioButton(WebDriver driver, String name, String ID) {


        for (WebElement each : driver.findElements(By.name(name))) {

            String eachID = each.getAttribute("id");

            driver.findElement(By.id(ID)).click();

            System.out.println(each.getAttribute("id"));


        }
    }


}
