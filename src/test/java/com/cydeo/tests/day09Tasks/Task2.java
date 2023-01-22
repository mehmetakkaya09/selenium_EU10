package com.cydeo.tests.day09Tasks;

import com.cydeo.utility.Driver;
import com.cydeo.utility.SmartBearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {
    @Test
    public void test1() {
        SmartBearUtils.login(Driver.getDriver());
        Faker faker = new Faker();
        WebElement order = Driver.getDriver().findElement(By.linkText("Order"));
        order.click();
        Select album = new Select(Driver.getDriver().findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct")));
        album.selectByVisibleText("FamilyAlbum");
        WebElement quantity = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.clear();
        quantity.sendKeys("2");
        WebElement calculate = Driver.getDriver().findElement(By.cssSelector("input[value='Calculate']"));
        calculate.click();
        WebElement name = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        name.sendKeys(faker.name().fullName());
        WebElement street = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        street.sendKeys(faker.address().streetName());
        WebElement city = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys(faker.address().cityName());
        WebElement state = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        String stateName = faker.address().stateAbbr();
        state.sendKeys(stateName);
        WebElement zip = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zip.sendKeys(faker.address().zipCodeByState(stateName).replaceAll("#", "0"));
        WebElement visa = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visa.click();
        WebElement card = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        card.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        WebElement expire = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        int mmDate = faker.number().numberBetween(1, 12);
        String mmStr = "";
        if (mmDate > 0 && mmDate < 10) {
            mmStr = "0" + mmDate;
        }
        expire.sendKeys(mmStr + "/" + faker.number().numberBetween(23, 33));
        WebElement process = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        process.click();
        WebElement result = Driver.getDriver().findElement(By.xpath("//strong[normalize-space()='New order has been successfully added.']"));
        Assert.assertEquals(result.getText(),"New order has been successfully added.");
    }
}
