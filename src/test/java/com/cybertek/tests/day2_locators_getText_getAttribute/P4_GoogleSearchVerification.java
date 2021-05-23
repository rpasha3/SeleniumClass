package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {

        //TC #4: Google search
        //1- open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https/www.google.com
        driver.get("https:/www.google.com");

        //3- write "apple" in search box
        //4- click google search button (ENTER BUTTON)
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);


        //5- verify title:
        //title should start with "apple" word
        String expectedTitle =  "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }
    }





}
