package com.cydeo.utility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL,String expectedTitle) {

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains(expectedInURL)) {
                Assert.assertEquals(expectedTitle,driver.getTitle());
                break;
            }
        }
    }
    public static void switchWindow(WebDriver driver, String expectedInURL) {

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }
        }
    }



}
/*
TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
 */