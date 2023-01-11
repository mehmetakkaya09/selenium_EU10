package com.cydeo.tests.day07Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import org.testng.annotations.Test;

public class UtilTest extends BeforeMethodUtil {

    @Override
    public void test1() {
       getDriver().get("https://www.amazon.com");
    }

    @Test (priority = 2)
    public void test2() {
        getDriver().get("https://www.etsy.com");
    }

    @Test(priority = 3)
    public void test3() {
        getDriver().get("https://www.facebook.com");
    }




}
