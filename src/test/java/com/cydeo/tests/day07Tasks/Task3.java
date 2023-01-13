package com.cydeo.tests.day07Tasks;

import com.cydeo.utility.BeforeMethodUtil;
import com.cydeo.utility.Crm_Login;
import com.cydeo.utility.PropertyUtility;
import org.testng.annotations.Test;

public class Task3 extends BeforeMethodUtil {

    @Test
    public void test1() {
        String username1= PropertyUtility.keyValue("username");
        String password1= PropertyUtility.keyValue("password");
        Crm_Login.usernamePassword(driver(), username1,password1);
        Crm_Login.verifyTitle(driver(),"Portal");
    }


}
