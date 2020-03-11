package com.automation.tests.day07;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class Xpath {
    static WebDriver driver;
    static String userNameLocator ="//label[text()='Username']/following-sibling::input";
    static String userPasswordLocator = "//label[text()='Password']/following-sibling::input";
    public static void main(String[] args) {
        driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("Admin");
        driver.findElement(By.xpath(userPasswordLocator)).sendKeys("pass");
        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();

        BrowserUtils.wait(2);
        driver.quit();


    }
}
