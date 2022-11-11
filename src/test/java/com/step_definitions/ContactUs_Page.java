package com.step_definitions;

import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ContactUs_Page {


    @When("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().navigate().to(homePage);
        Driver.getDriver().manage().window().maximize();
    }
    @When("clicks to {string} page")
    public void clicks_to_page(String contactUs) {

        //Driver.getDriver().findElement(By.xpath("//a/span[.=\""+contactUs+"\"]")).click();
        //Driver.getDriver().findElement(By.partialLinkText("contact-us"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().findElement(By.xpath("//a/span[.=\"Contact Us\"]")).click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assertions.assertTrue(actualTitle.contains("Sign"));

    }
    @Then("Spectrum contact page should open")
    public void spectrum_contact_page_should_open() {



    }
}
