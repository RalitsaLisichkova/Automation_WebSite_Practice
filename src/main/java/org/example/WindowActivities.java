package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //Waiting to load fully content of the page
        driver.get("http://google.com");

        // without wait with this operation !!!
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(2000);
        // navigate to previous page --> Google
        driver.navigate().back();

        driver.navigate().forward();


    }
}
