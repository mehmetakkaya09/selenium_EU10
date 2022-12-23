package com.cydeo.tests.day2Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNew {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com");

        //provide "thy" to searh box
        WebElement thy = driver.findElement(By.name("q"));
        thy.sendKeys("thy"+ Keys.ENTER);

        WebElement site = driver.findElement(By.tagName("h3"));
        site.click();
        Thread.sleep(10000);

        //provide "istanbul" to "from" inputbox
        WebElement from = driver.findElement(By.id("portInputFrom"));
        from.sendKeys("istanbul");

        //provide "ankara" to "to" inputbox
        WebElement to = driver.findElement(By.id("portInputTo"));
        to.sendKeys("ankara");

        //click on dates
        WebElement dates = driver.findElement(By.xpath("//span[@id='dateSelector']//span[@class='date-view date-view-text-cell'][normalize-space()='Dates']"));
        dates.click();

    }
}
