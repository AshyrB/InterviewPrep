package com.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private Driver(){}


    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        return driver;

    }
}
