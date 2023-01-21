package com.cydeo.tests.day09Tasks;

import com.cydeo.utility.Driver;
import com.cydeo.utility.PropertyUtility;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaFakerPractice {

    @Test
    public void test1() {

        Faker faker = new Faker();
//        System.out.println(faker.internet().password(8,12,true,true,true));
//        SmartBearUtils.login(Driver.getDriver());
//        Driver.getDriver().quit();
        String registration = PropertyUtility.keyValue("registration");
        Driver.getDriver().get(registration);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String first = faker.name().firstName().replaceAll("'","");
        firstName.sendKeys(first);
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String last = faker.name().lastName().replaceAll("'","");
        lastName.sendKeys(last);
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(first+last);
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(first.toLowerCase()+"."+last.toLowerCase()+"@gmail.com");
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password(8,12,true,true,true));
        WebElement phone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.numerify("571-###-####"));
        WebElement male = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        male.click();
        WebElement birthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys(faker.number().numberBetween(1,12)+"/"+faker.number().numberBetween(1,30)+"/"+faker.number().numberBetween(1930,2023));
        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByIndex(faker.number().numberBetween(1,9));
        Select job_title = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        job_title.selectByIndex(faker.number().numberBetween(1,8));
        WebElement java = Driver.getDriver().findElement(By.id("inlineCheckbox2"));
        java.click();
        WebElement signUp = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUp.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[.=\"You've successfully completed registration!\"]")).isDisplayed());
    }

}
