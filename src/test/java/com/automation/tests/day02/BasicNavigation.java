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
        Thread.sleep(5000);
      if(driver.getTitle().equals("Google")){
            System.out.println("Title test is passed");
        }else{
          System.out.println("Test test is failed");
      }
      driver.navigate().to("http://amazon.com");
      if(driver.getTitle().toLowerCase().contains("amazon")){
          System.out.println("Title test is passed for amazon");
      }else{
          System.out.println("Test test is failed");
      }
      driver.navigate().back();
      verifyEquals(driver.getTitle(),"Google");

      //=========================
      driver.close();

    }

    public static void verifyEquals(String arg1, String arg2){
        if(arg1.equals(arg2)){
            System.out.println("Title test is passed");
        }else{
            System.out.println("Test test is failed");
        }
    }

}
