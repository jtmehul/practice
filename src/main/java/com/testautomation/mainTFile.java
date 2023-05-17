package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class mainTFile{
    
    //Here we wrote constructor which return webdriver instance and thne 
    //using the driver to locate and find element
    
    WebDriver driver;
    public mainTFile(WebDriver driver){
        driver = this.driver;
    }
    public static By gmaillinkClick = By.xpath(browserClass.gmailLink);

    public static WebDriver clickOnGmailLink(WebDriver driver){
        driver.findElement(gmaillinkClick).click();
        return driver;
    }

}