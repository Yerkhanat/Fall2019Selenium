package com.automation.tests.day04;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindElementsTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(2000);
        List <WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement each: links){

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
//            each.sendKeys(Keys.ENTER);
//            Thread.sleep(2000);
//            driver.navigate().back();
        }

        for (int i = 1; i <links.size() ; i++) {
            List<WebElement> links2 = driver.findElements(By.tagName("a"));
            links2.get(i).click();
            Thread.sleep(2000);
            driver.navigate().back();

        }

//        Iterator<WebElement> iterator = links.iterator();
//        if (iterator.hasNext()){
//            iterator.next().click();
//            driver.navigate().back();
//
//        };




       // driver.quit();



    }
}
