package com.automation.tests.day04;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyThatElementIsGone  {
    public static void main(String[] args) throws Exception {
        WebDriver driver= DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.id("disappearing_button")).click();
        Thread.sleep(2000);

        if (driver.findElements(By.id("disappearing_button")).size()==0){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.quit();

    }
}
