package com.automation.tests.day03;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {
    public static void main(String[] args) throws Exception {
        WebDriver driver = DriverFactory.CreateDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.findElement(By.name("full_name")).sendKeys("Yerkhanat Myedyeukhan");
        driver.findElement(By.name("email")).sendKeys("erha.mts@gmail.com");
        driver.findElement(By.className("radius")).submit();
        if(driver.findElement(By.name("signup_message")).getText().equals("Thank you for signing up. Click the button below to return to the home page.")){
            System.out.println("Test passed");

        }else {
            System.out.println("Test failed");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
