package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.time.Duration;

import static java.lang.Thread.sleep;

/**
 * Hello world!
 *
 */
public class  Locators {
    public static void main( String[] args ) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate to page
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Find element by ID
        driver.findElement(By.id("inputUsername")).sendKeys("Ralitsa");

        // Find element by name
        driver.findElement(By.name("inputPassword")).sendKeys("3897359");

        // Find element by class name
        driver.findElement(By.className("signInBtn")).click();

        // Wait in milliseconds
        Thread.sleep(1000);

        // Find element by Link Text
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Find element by generic CSS selector
//      driver.findElement(By.cssSelector("div[class='forgot-pwd-container'] a")).getText();

        // Text in element assertion
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='forgot-pwd-container'] a")).getText(), "Forgot your password?");


        // To escape ELEMENT INTERCEPTION when application is in changing state
        Thread.sleep(2000);


        // Find element by xPath
        Assert.assertEquals(driver.findElement(By.xpath("//form[@action='#']/h2")).getText(), "Forgot password");
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();



        // To identify button based on text --> //button[text()='text on button'] !!!
        driver.findElement(By.xpath("//button[text()='Reset Login']"));

        //Sibling - Child to parent traverse
        // //header/div/button[1]/following-sibling::button[1]














    }
}
