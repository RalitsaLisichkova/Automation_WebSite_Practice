package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static void main(String[] args) {

        // Interface WebDriver defined all driver's methods


        // Classes that implement methods from WebDriver Interface!!!
        // We will have webdriver methods + chromedriver methods
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        System.out.println(currentUrl.contains("https://rahulshettyacademy.com/"));
        driver.close();



    }
}
