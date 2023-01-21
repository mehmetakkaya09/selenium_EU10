package com.cydeo.tests.day06Tasks;

import com.cydeo.utility.ChromeStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task3_WindowHandle {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        driver=null;
    }

    @Test
    public void windowHandleTest() {
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        String windowHandle1 = driver.getWindowHandle();
        clickHere.click();
        Set<String> windowHandles = driver.getWindowHandles();
        String window[] = new String[2];
        int indexNum = 0;
        for (String windowHandle : windowHandles) {
            window[indexNum++] = windowHandle;
//            if (windowHandle.equals(driver.getWindowHandle())){
//                continue;
//            }
        }
        driver.switchTo().window(window[1]);
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(Arrays.toString(window));





    }

}
