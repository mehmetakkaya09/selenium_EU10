package com.cydeo.tests.day08Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test3 extends BeforeMethodUtil {

    private static void getTableGetEmail(WebDriver driver, String tableNum, String firstName) {
        System.out.println(driver.findElement(By.xpath("//table[" + tableNum + "]//td[.='" + firstName + "']/following-sibling::td[1]")).getText());
    }

    @Test
    public void test1() {
        driver.get("https://practice.cydeo.com/tables");
            getTableGetEmail(driver,"2","Jason");
    }




}
