package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self_Practice01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.yahoo.com");
        Thread.sleep(3000);
        driver.findElement(By.id("ybar-sbq")).sendKeys("Supra" + Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.linkText("The 2021 Toyota® GR Supra - Believe the Hype")).click();

        String expectedTitle = "Supra";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

        String expectedInUrl = "Supra";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }


    }
}
