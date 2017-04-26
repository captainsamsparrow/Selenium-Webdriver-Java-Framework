package com.boxed.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.boxed.config.Config;
import org.openqa.selenium.WebElement;

public class FAQPage {
    WebDriver driver;

    public static String espanolToggle = "//a[@data-reactid='1012']";


    public FAQPage(WebDriver driver){
        this.driver = driver;
    }

    //--------

    public void clickEspanolToggle(){
        driver.findElement(By.xpath(espanolToggle)).click();
    }

    public void verifyLanguageHasBeenChanged(){

    }
}
