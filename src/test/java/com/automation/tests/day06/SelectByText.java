package com.automation.tests.day06;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByText {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        //create a webelement object for drop-down first
        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));
        //provide weblement object into constructor
        Select selectSimpleDropdown = new Select(simpleDropdown);
        //select by visible text
        selectSimpleDropdown.selectByVisibleText("Option 2");
        BrowserUtils.wait(3);
        //and select option 1
        selectSimpleDropdown.selectByVisibleText("Option 1");
        //select you DOB
        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));

        selectMonth.selectByVisibleText("June");
        selectYear.selectByVisibleText("1991");
        selectDay.selectByVisibleText("28");
        BrowserUtils.wait(5);


        List<WebElement> months = selectMonth.getOptions();
        for (WebElement month:months) {
            selectMonth.selectByVisibleText(month.getText());
            BrowserUtils.wait(1);

        }
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("California");
        String selected = stateSelect.getFirstSelectedOption().getText();
        if (selected.equals("California")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }


        driver.quit();
    }
}