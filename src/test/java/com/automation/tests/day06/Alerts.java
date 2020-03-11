package com.automation.tests.day06;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);
        //to get the text from popup message
        String popupText = driver.switchTo().alert().getText();
        System.out.println(popupText);
        driver.switchTo().alert().accept();//to click OK
        String expected = "You successfully clicked an alert";
        String actual = driver.findElement(By.id("result")).getText();
        //if will fail, because there is a typo ##BUG##
        if(expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("Expected: "+expected);
            System.out.println("Actual:   "+actual);
        }
        BrowserUtils.wait(3);
        driver.quit();
    }
}