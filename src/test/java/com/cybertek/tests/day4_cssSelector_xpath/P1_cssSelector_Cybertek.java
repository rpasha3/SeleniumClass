package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        //TC 1 : practice verfication
        //1 open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2: goto http://practice.cybertekschool.com/forgot_password"
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3: locate all the WebElements on the web page using XPATh and / or CSS locator only
        //a. "Home" link
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //b "forgot password" header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        //c. Email text
        WebElement emailLabel = driver.findElement(By.cssSelector("[for='email']"));

        //d. email input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

        //e. "retrieve password" button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));


    }
}
