package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        driver.findElement(By.xpath("(//a/span[.=\"Хоккей\"])[1]")).click();


    }

}
