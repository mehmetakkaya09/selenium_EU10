package com.cydeo.tests.day09Tasks;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {

    @Test
    public void test1() {
        Driver.getDriver().get("https://www.openxcell.com");
        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//a"));
        System.out.println("links.size() = " + links.size());
        int count = 0;
        for (WebElement link : links) {
            System.out.println(link.getText());
            if (link.getText().isEmpty()) {
                count++;
            }
        }
        System.out.println(count);


    }



}
