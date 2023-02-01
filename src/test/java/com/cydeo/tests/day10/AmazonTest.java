package com.cydeo.tests.day10;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTest {
    @Test
    public void testAmazon() {
        WebDriver driver = Driver.getDriver();
        sizeTest(driver, "128");
    }
    public static void sizeTest(WebDriver driver, String sizeText){
        driver = Driver.getDriver();
        driver.get("https://www.amazon.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("icp-nav-flyout"))).perform();
        WebElement language = driver.findElement(By.xpath("//div[.='Change country/region.']"));
        language.click();
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.id("icp-dropdown_18")).click();
        driver.findElement(By.id("icp-save-button")).click();

        for (String windowHandle : driver.getWindowHandles()) {
            if (windowHandle.equals(driver.getWindowHandle())) {
            } else {
                driver.switchTo().window(windowHandle);
            }
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13 512" + Keys.ENTER);
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.findElement(By.linkText("Apple iPhone 13 (512 GB) - Yıldız Işığı")).click();
        WebElement size = null;
        if (sizeText.equals("512")) {
            size = driver.findElement(By.xpath("(//p[@class='a-text-left a-size-base'])[3]"));
        } else if (sizeText.equals("256")) {
            size = driver.findElement(By.xpath("(//p[@class='a-text-left a-size-base'])[2]"));
        } else if (sizeText.equals("128")) {
            size = driver.findElement(By.xpath("(//p[@class='a-text-left a-size-base'])[1]"));
        }
        size.click();
        WebElement color = driver.findElement(By.xpath("//div[@id='variation_color_name']//span[@class='selection']"));
        WebElement price = driver.findElement(By.xpath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span/span[2]/span[1]"));
        String priceText = price.getText();
        WebElement stock = driver.findElement(By.xpath("//span[normalize-space(text())='Stokta var.']"));
        System.out.println("size = " + size.getText());
        if (color.getText().equalsIgnoreCase("Yıldız Işığı")) {
            System.out.println("color = " + color.getText());
        } else {
            System.out.println(size.getText() +" "+ color.getText()+ " bulunmaktadır. Ancak 'Yıldız ışığı' rengi mevcut değildir!");
        }
        System.out.println("price = " + priceText);
        System.out.println("stock = " + stock.getText());
    }
}
