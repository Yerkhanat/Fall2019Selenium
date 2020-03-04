package com.automation.tests.day03;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementById {
    public static void main(String[] args) throws Exception {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).submit();

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual =driver.findElement (By.tagName ( "h4" )).getText ();

        if(expected.equals(actual)){
            System.out.println ("TEST PASSED");
        } else{
            System.out.println ("TEST FAILED");
        }


        driver.findElement(By.linkText("Logout")).click();



        Thread.sleep(2000);
        driver.quit();




    }
}
