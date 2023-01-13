package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Crm_Login {

    public static void usernamePassword(WebDriver driver, String username, String password) {
        driver.get("http://login1.nextbasecrm.com/");
        WebElement userLogin = driver.findElement(By.name("USER_LOGIN"));
        userLogin.sendKeys(username);
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-btn"));
        loginButton.click();
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(),expectedTitle,"Failed");
    }


}
