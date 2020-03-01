package com.automation.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class JumpToTheNewWindow {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("http://google.com");
//        Thread.sleep(2000);
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        //driver.switchTo().window("http://google.com");

        Thread.sleep(5000);
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        System.out.println("before switching "+ driver.getCurrentUrl());
        for (String each :windowHandles) {
            if(!each.equals(driver.getWindowHandle())){
                driver.switchTo().window(each);
            }

        }
        System.out.println("after switching the tab "+ driver.getCurrentUrl());

        switchToWindowsBasedOnTitle("Practice",driver);
        System.out.println(driver.getCurrentUrl());


        //===============================
        driver.quit();
    }

    public static void switchToWindowsBasedOnTitle(String pageTitle, WebDriver driver) {
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
            if (driver.getTitle().equals(pageTitle)) {
                break;

            }

        }


    }

}

