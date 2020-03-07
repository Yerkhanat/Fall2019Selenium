package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestforiFrame {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        System.out.println(driver.findElement(By.id("tinymce")).getText());
        BrowserUtils.wait(4);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hello world");
        System.out.println(driver.findElement(By.id("tinymce")).getText());
        BrowserUtils.wait(4);
        driver.switchTo().defaultContent();
    driver.quit();
    }
}
