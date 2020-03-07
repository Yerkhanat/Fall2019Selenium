package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonsTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        BrowserUtils.wait(2);
        if(driver.findElement(By.id("black")).isDisplayed()&&driver.findElement(By.id("black")).isEnabled()) {
            driver.findElement(By.id("black")).click();
            System.out.println("Clicked on black button");
        }else {
            System.out.println("button is not enabled");
        }
        if(driver.findElement(By.id("black")).isSelected()){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");
        }
        BrowserUtils.wait(2);
        driver.quit();

    }
}
