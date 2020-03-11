package com.automation.tests.day06;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select selectState = new Select(driver.findElement(By.id("state")));
        selectState.selectByValue("CA");
        String expected = "California";
        if (expected.equals(selectState.getFirstSelectedOption().getText())){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }




        BrowserUtils.wait(3);
        driver.quit();


    }
}
