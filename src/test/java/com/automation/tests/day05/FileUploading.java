package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploading {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/upload");
        BrowserUtils.wait(5);
        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        String filePath = System.getProperty("user.dir")+"/pom.xml";
        String filePath2 = "/Users/yerkhanat/Desktop/Screen Shot 2020-03-01 at 10.08.45 AM.png";
        fileUpload.sendKeys(filePath2);
        driver.findElement(By.id("file-submit")).click();

        BrowserUtils.wait(5);






        driver.quit();
    }
}
