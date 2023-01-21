package com.cydeo.tests.day07Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import org.testng.annotations.Test;

public class UtilTest extends BeforeMethodUtil {

    @Test
    public void test1() {
       driver.get("https://www.amazon.com");
    }

    @Test (priority = 2)
    public void test2() {
        driver.get("https://www.etsy.com");
    }

    @Test(priority = 3)
    public void test3() {
        driver.get("https://www.facebook.com");
    }




}
