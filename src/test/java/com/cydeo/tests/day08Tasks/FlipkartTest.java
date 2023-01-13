package com.cydeo.tests.day08Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlipkartTest extends BeforeMethodUtil {

    @Test
    public void test1() {

        driver().get("https://www.flipkart.com/");
        WebElement exitButton = driver().findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        exitButton.click();
        WebElement searchButton = driver().findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        searchButton.click();
        implicitSeconds(10);
        WebElement tShirt = driver().findElement(By.xpath("//a[.='t shirts']"));
        tShirt.click();




    }




}
