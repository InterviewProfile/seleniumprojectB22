package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {
//        TC #1: Yahoo Title Verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

//        Maximize browser
        driver.manage().window().maximize();

//        2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

//        3. Verify title:
//        Expected: Yahoo
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);

//        actual title
        String actualTitle = driver.getTitle();

//        Creating our verification
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!!!");
        }

//        Closing the  browser
        driver.close();



    }
}
