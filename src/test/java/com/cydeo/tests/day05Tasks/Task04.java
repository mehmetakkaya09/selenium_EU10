package com.cydeo.tests.day05Tasks;

import com.cydeo.utility.ChromeStart;
import com.cydeo.utility.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task04 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = ChromeStart.chromeStart();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void dropDownTest() throws InterruptedException {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        String actualText = select.getFirstSelectedOption().getText();
        String expectedText= "Please select an option";
        Assert.assertEquals(actualText,expectedText);
        select.selectByIndex(1);
        WaitUtility.waitSeconds(2.5);

    }

    @Test(priority = 2)
    public void stateTest() {
        Select select = new Select(driver.findElement(By.id("state")));
        String actualText = select.getFirstSelectedOption().getText();
        String expectedText = "Select a State";
        Assert.assertEquals(actualText,expectedText);
        select.selectByVisibleText("Arkansas");
        WaitUtility.waitSeconds(2);
        select.selectByIndex(7);
        WaitUtility.waitSeconds(2);
        select.selectByValue("LA");
        WaitUtility.waitSeconds(2);
    }

    @Test
    public void dateTest() {

        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectYear.selectByVisibleText("1990");
        selectMonth.selectByValue("9");
        selectDay.selectByIndex(9);
        WaitUtility.waitSeconds(4);
    }

    @Test
    public void facebookTest() {

        WebElement dropdownMenuLink = driver.findElement(By.id("dropdownMenuLink"));
        dropdownMenuLink.click();
        WebElement facebookBtn = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookBtn.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook – log in or sign up";
        Assert.assertEquals(actualTitle,expectedTitle);
        WaitUtility.waitSeconds(2);
    }

    @Test
    public void allSelectTest() {

        for (WebElement element : driver.findElements(By.tagName("select"))) {
            Select select = new Select(element);

            try {
                System.out.println(select.getFirstSelectedOption().getText());
            }catch (RuntimeException e){
                System.out.println("Olur Öyle");
            }

        }


    }


}
