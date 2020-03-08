package com.automation.tests.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import com.automation.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigationTests1 {
    public static void main(String[] args) {
       WebDriver driver = DriverFactory.CreateDriver("safari");
       //WebDriver driver =DriverFactory.CreateDriver("chrome");

        driver.get("http://www.google.com");
        String titleGoogle = driver.getTitle();
        driver.get("http://www.etsy.com");
        String titleEtsy = driver.getTitle();
        BrowserUtils.wait(2);
        driver.navigate().back();
       StringUtility.verifyEquals(titleGoogle,titleEtsy);
       driver.navigate().forward();
       StringUtility.verifyEquals(titleEtsy,driver.getTitle());
       driver.quit();



    }
}
