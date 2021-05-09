package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        //Setup the web browser
        WebDriverManager.chromedriver().setup();
        //open the web browser
        WebDriver driver = new ChromeDriver();
        //maximize the page
        driver.manage().window().maximize();

        driver.get("http:practice.cybertekschool.com/");

        //Verify  the  URL contains
        //expected:cybertekschool

        String expectedURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("Expected verification PASSED");
        } else
            System.out.println("Expected verification FAILED");


        //Verify title:
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
        System.out.println("Title verification PASSED!");
        }else{
        System.out.println("Title verification FAILED!!!");

    }
}
}
