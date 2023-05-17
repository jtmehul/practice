package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserClass {

    public static String url = "https://google.com";
    public static String pathChromeDriver = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
    public static String gmailLink = "//div[@class='gb_u gb_v'][1]";
    public static WebDriver driver = null;


    //This method will launch the chrome browser and maximize the window
    public static WebDriver launchBrowser(WebDriver driver){
        System.setProperty("webdriver.chrome.driver",browserClass.pathChromeDriver);
        driver = new ChromeDriver();
        driver.get(browserClass.url);
        driver.manage().window().maximize();
        return driver;
    }
}
