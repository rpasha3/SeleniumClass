package com.cybertek.utilities;
//TASK : NEW METHOD CREATION
//Method name : getDriver
// static method
//accept String arg : browserType
//  - this arg will determine what type of browser is opened
// if "chrome" pass --> open chrome
//if firefox pass --> open firefox
//return type WebDriver

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static void main(String[] args) {
     getDriver("firefox");
    }


    public static WebDriver getDriver(String browserType) {

        if(browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if(browserType.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type does not exist. Driver = null");
        }
        return null;
    }



}
