package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFrame {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/nested_frames");
        BrowserUtils.wait(4);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement content = driver.findElement(By.id("content"));
        System.out.println(content.getText());
      driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.quit();

    }
}
