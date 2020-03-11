package com.automation.tests.day06;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class NoSelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        driver.findElement(By.id("dropdownMenuLink")).click();
        List<WebElement> allLinks = driver.findElements(By.className("dropdown-item"));
        for (WebElement link : allLinks
        ) {
            System.out.println(link.getAttribute("href"));

        }
        driver.findElement(By.linkText("Amazon")).click();
        BrowserUtils.wait(2);





        BrowserUtils.wait(3);
        driver.quit();

    }
}
