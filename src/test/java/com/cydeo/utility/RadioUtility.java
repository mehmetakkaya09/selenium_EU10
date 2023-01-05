package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioUtility {

    public static void clickAndVerifyRadioButton(WebDriver driver, String name, String id) {


        List<WebElement> nameElements = driver.findElements(By.name(name));
        for (WebElement nameElement : nameElements) {
            String each = nameElement.getAttribute("id");
            if (each.equalsIgnoreCase(id)){
                nameElement.click();
                System.out.println(each+" is clicked = "+ nameElement.isSelected());
                break;
            }
        }


    }


}
