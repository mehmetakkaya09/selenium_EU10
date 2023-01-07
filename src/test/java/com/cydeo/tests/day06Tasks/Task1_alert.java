package com.cydeo.tests.day06Tasks;

import com.cydeo.utility.ChromeStart;
import com.cydeo.utility.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1_alert {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void alertTest() {
        WebElement clickJS = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        clickJS.click();
        driver.switchTo().alert().accept();
        String exRes = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']")).getText();
        String actRes = "You successfully clicked an alert";
        Assert.assertEquals(exRes, actRes, "verify failed");
    }

    @Test
    public void alertConfirmTest() {
        WebElement clickConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickConfirm.click();
        driver.switchTo().alert().accept();
        String exRes = driver.findElement(By.xpath("//p[.='You clicked: Ok']")).getText();
        String actRes = "You clicked: Ok";
        Assert.assertEquals(exRes, actRes);
    }

    @Test
    public void alertPromptTest() {
        WebElement clickPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickPrompt.click();
        WaitUtility.waitSeconds(1);
        driver.switchTo().alert().sendKeys("hello");
        driver.switchTo().alert().accept();
        String exRes = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String actRes = "You entered: hello";
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).isDisplayed());
        Assert.assertEquals(exRes, actRes);
    }


}
