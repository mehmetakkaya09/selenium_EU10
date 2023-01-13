package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String costumerName){
        return driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='"+ costumerName+"']/following-sibling::td[3]")).getText();
    }

    public static void orderVerify(WebDriver driver,String costumerName, String expectedOrderDate) {
        Assert.assertEquals(driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='"+ costumerName+"']/following-sibling::td[3]")).getText(), expectedOrderDate);
    }


}
