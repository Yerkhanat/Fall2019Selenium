package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        // verify that 1st checkbox is not selected and 2nd is selected
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        BrowserUtils.wait(2);
        for (int i = 0; i <checkBoxes.size() ; i++) {
            if(checkBoxes.get(i).isSelected()){
                System.out.println("checkbox "+ (i+1)+" is selected");
            }else {
                System.out.println("checkbox "+ (i+1)+" is not selected");

            }

        }
        BrowserUtils.wait(2);
        driver.quit();
    }
}
