package com.testautomation;

import org.openqa.selenium.WebDriver;


public class Test1 extends browserClass{  
   
    //This file will have only test cases
   public static WebDriver driver =null;
    public static void main(String args[]) {
    driver = browserClass.launchBrowser(driver);
    mainTFile.clickOnGmailLink(driver);
       }
}
