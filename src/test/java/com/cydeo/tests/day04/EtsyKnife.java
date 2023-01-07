package com.cydeo.tests.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyKnife {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("etsy"+ Keys.ENTER);
        //Thread.sleep(3000);
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div > div > div.yuRUbf > a > h3")).click();
        //Thread.sleep(3000);
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Handmade Knife"+Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("img[src='https://i.etsystatic.com/26694795/c/2445/1943/282/0/il/035b01/3254592822/il_340x270.3254592822_5dss.jpg']")).click();

        for (String windowHandle : driver.getWindowHandles()) {
            if (windowHandle.equals(driver.getWindowHandle())) {
                continue;
            }
            driver.switchTo().window(windowHandle);
        }

        WebElement addToCart = driver.findElement(By.xpath("//div[@data-selector='add-to-cart-button']/button"));
        addToCart.click();
        driver.quit();



    }
}