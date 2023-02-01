package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Todomvc {
    @Test
    public void test1() {

        WebDriver driver = Driver.getDriver();
        driver.get("http://todomvc.com/");
        driver.findElement(By.xpath("//div[.='JavaScript']")).click();
        driver.findElement(By.xpath("//a[.='Polymer']")).click();
        driver.findElement(By.id("new-todo")).sendKeys("aaa"+ Keys.ENTER);
        driver.findElement(By.id("new-todo")).sendKeys("bbb"+ Keys.ENTER);
        WebElement bbb = driver.findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));
        Actions actions = new Actions(driver);
        actions.doubleClick(bbb).perform();
        actions.doubleClick().sendKeys(Keys.BACK_SPACE).perform();
        actions.sendKeys("ccc"+Keys.ENTER).perform();

    }
}
