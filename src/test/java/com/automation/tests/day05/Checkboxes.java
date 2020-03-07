package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(2);

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        checkBoxes.get(0).click();
        BrowserUtils.wait(1);
        if(checkBoxes.get(1).isSelected()){
        //checkBoxes.get(1).click();
            System.out.println("checkbox "+1+" is selected already");
        }else {
            checkBoxes.get(1).click();
        }

        BrowserUtils.wait(2);
        driver.quit();
    }
}
