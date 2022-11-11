package com.selenium;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_01 {

    @Test
    public void test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://news.sportbox.ru");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("(//a/span[.=\"Хоккей\"])[1]")).click();
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assertions.assertTrue(actualTitle.contains("Новости"));

        driver.close();


    }

}
