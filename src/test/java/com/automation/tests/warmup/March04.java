package com.automation.tests.warmup;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class March04 {
    public static void main(String[] args) throws Exception {
      //ebayTest("Java book");
     // ebayTest();
      //  amazonTest();
        wikipediaTest();
    }

public static void ebayTest(String text) throws Exception {
    WebDriver driver = DriverFactory.CreateDriver("chrome");
    driver.get("http://ebay.com");
    driver.findElement(By.name("_nkw")).sendKeys(text);
    driver.findElement(By.id("gh-btn")).submit();

    System.out.println("Result is "+ driver.findElement(By.xpath("//*[@id=\"mainContent\"]//span[@class=\"BOLD\"]")).getText());
    Thread.sleep(2000);


    driver.quit();




    }

 public static void ebayTest(){

        WebDriver driver = DriverFactory.CreateDriver("chrome");
     driver.get("http://ebay.com");
     driver.findElement(By.name("_nkw")).sendKeys("blabla");
     driver.findElement(By.id("gh-btn")).submit();

     if(driver.getTitle().equals("blabla | eBay")){
         System.out.println("Ebay search test passed");

     }else
     {
         System.out.println("Ebay search test failed");
     }

     driver.quit();



    }

 public static void amazonTest() {

       WebDriver driver = DriverFactory.CreateDriver("chrome");
       driver.get("http://amazon.com");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);

       if (driver.getTitle().contains("java book")){
           System.out.println("Amazon test passed");
       }else{
           System.out.println("Amazon test failed");
       }
       driver.quit();


    }

 public static void wikipediaTest(){
        WebDriver driver = DriverFactory.CreateDriver("chrome");
        driver.get("http://wikipedia.org");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.ENTER);
     driver.findElement(By.partialLinkText("Selenium (software)")).click();
     if(driver.getCurrentUrl().endsWith("Selenium_(software)"))
     {
         System.out.println("test passed");
     }else
     {
         System.out.println("test failed");
     }
        driver.quit();
 }

}
