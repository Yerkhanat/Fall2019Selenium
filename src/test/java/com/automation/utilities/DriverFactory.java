package com.automation.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    public static WebDriver CreateDriver(String browserName){

        if(browserName.equalsIgnoreCase("Chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("Interner Explorer") ||(browserName.equalsIgnoreCase("IE") ) ){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }else {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }
    }


}
