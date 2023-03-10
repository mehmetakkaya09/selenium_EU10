package com.cydeo.tests.day01Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.close();
//        Faker faker = new Faker();
//        System.out.println(faker.numerify("####"));
//        System.out.println(faker.letterify("???-???").toUpperCase());
//        System.out.println(faker.bothify("###-???"));
//        System.out.println(faker.internet().password(5,10,true,true,true));
    }
}
