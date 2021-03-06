package com.automation.tests.day05;
import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class RadioButtons {
    public static void main(String[] args){
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);
        //<input type="radio">
        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));
        for(WebElement radioButton: radioButtons){
            radioButton.click();
            boolean isSelected = radioButton.isSelected();
            System.out.println(radioButton.getAttribute("id")+" is selected? "+isSelected);
            if(radioButton.isEnabled()) {
                System.out.println("Clicked on ::" + radioButton.getAttribute("id"));
            }else{
                System.out.println("This button is disabled ::"+ radioButton.getAttribute("id"));
            }
            BrowserUtils.wait(1);
        }
        driver.quit();
    }
}