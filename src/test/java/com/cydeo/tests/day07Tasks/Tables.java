package com.cydeo.tests.day07Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tables extends BeforeMethodUtil {

    @Test
    public void test1() {

        driver().get("https://practice.cydeo.com/web-tables");
        List<WebElement> elements = driver().findElements(By.xpath("//table[@class='SampleTable']/tbody/tr[2]"));
        WebElement element = driver().findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[6]/preceding-sibling::td[2]"));
        System.out.println(element.getText());
//        for (WebElement element : elements) {
//            System.out.println(element.getText());
//        }



    }




}
