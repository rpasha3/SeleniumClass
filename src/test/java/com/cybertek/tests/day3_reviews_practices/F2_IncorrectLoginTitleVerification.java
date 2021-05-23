package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC 2: Facebook incorrect login title verification
        //1. Open Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the 'driver' object created to use selnium methods
        //maximize browser
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("http://www.facebook.com");

        //locating web element using id locator and storing it in WebElement type.
        WebElement inputUsername = driver.findElement(By.id("email"));

        //3. Enter incorrect username
        inputUsername.sendKeys("random213@gmail.com");

        //locate the web element using id and store it into WebElement type
        WebElement inputPassword = driver.findElement(By.id("pass"));

        //4. Enter incorrect password
        inputPassword.sendKeys("password123" + Keys.ENTER);

        //5. verify title changed to "Log into Facebook"
        String expectedTitle = "Log into Facebook";

        //freezing the code for 3 secs so that chrome browser can catch up loading the page
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }


    }
}
