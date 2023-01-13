package com.cydeo.tests.day08Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import com.cydeo.utility.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BeforeMethodUtil {


    @Test
    public void test11() {
        driver().get("https://practice.cydeo.com/web-tables");
        WebElement bobName = driver().findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='Bob Martin']"));
        System.out.println("bobName.getText() = " + bobName.getText());
        String bobNameText = bobName.getText();
        Assert.assertEquals(bobNameText,"Bob Martin");
        WebElement bobDate = driver().findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='Bob Martin']/following-sibling::td[3]"));
        String bobDateText = bobDate.getText();
        System.out.println("bobDateText = " + bobDateText);
        Assert.assertEquals(bobDateText,"12/31/2021");
        String bobMartinDate = WebTableUtils.returnOrderDate(driver(), "Bob Martin");
        System.out.println("bobMartinDate = " + bobMartinDate);
        WebTableUtils.orderVerify(driver(),"Bob Martin", bobMartinDate);
    }

}
