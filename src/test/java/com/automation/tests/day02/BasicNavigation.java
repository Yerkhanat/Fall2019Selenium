package com.automation.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception{
        // to start selenium script we need:
        // setup webDriver and create webDriver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.close();






    }
}
