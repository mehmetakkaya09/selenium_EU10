package com.cydeo.tests.day09Tasks;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void test1() {
        Driver.getDriver().get("https://www.calculator.net");
        WebElement search = Driver.getDriver().findElement(By.xpath("//input[@id='calcSearchTerm']"));
        search.sendKeys("gas mileage");
        WebElement searchButton = Driver.getDriver().findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        searchButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Gas Mileage Calculator");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h1")).isDisplayed());
        WebElement current = Driver.getDriver().findElement(By.xpath("//input[@id='mucodreading']"));
        current.clear();
        current.sendKeys("7925");
        WebElement previous = Driver.getDriver().findElement(By.xpath("//input[@id='mupodreading']"));
        previous.clear();
        previous.sendKeys("7550");
        WebElement gasAdded = Driver.getDriver().findElement(By.xpath("//input[@id='mugasputin']"));
        gasAdded.clear();
        gasAdded.sendKeys("16");
        WebElement gasPrice = Driver.getDriver().findElement(By.xpath("//input[@id='mugasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");
        WebElement calButton = Driver.getDriver().findElement(By.xpath("//table[@id='metric']/tbody//tr[5]//input"));
        calButton.click();
        String expText = Driver.getDriver().findElement(By.xpath("//b[.='23.44 km/L  or 4.27  L/100 km ']")).getText();
        Assert.assertTrue(expText.contains("23.44"));
    }
}
