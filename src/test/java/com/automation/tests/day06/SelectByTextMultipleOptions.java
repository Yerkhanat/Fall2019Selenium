package com.automation.tests.day06;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByTextMultipleOptions {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select languageSelect = new Select(driver.findElement(By.name("Languages")));
        languageSelect.selectByVisibleText("Java");
        boolean isMultiple = languageSelect.isMultiple();
        System.out.println(isMultiple);
        List<WebElement> languages = languageSelect.getOptions();
        for (WebElement language: languages
             ) {
            System.out.println(language.getText());

        }








        BrowserUtils.wait(3);
        driver.quit();
    }
}
