package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BsicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        //This line will determine the browser size
        driver.manage().window().maximize();

        //get the page for Tesla.com
        driver.get("https://www.tesla.com");

        //putting 3 seconds of of wait/ stops the code for 3 seconds
        Thread.sleep(3000);

        //going back using navigations
        driver.navigate().back();

        //putting 3 seconds of of wait/ stops the code for 3 seconds
        Thread.sleep(3000);

        //going  forward using navigations
        driver.navigate().forward();

        //putting 3 seconds of of wait/ stops the code for 3 seconds
        Thread.sleep(3000);

        //refreshing the page
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        System.out.println("Current title" + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Current URL = " + currentUrl);

        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab
        driver.close();


    }
}
