package com.boxed.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[@data-reactid='1012']")
    WebElement FAQLink;

    public HomePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    //--------------action constructor methods
    public void clickFAQlink(){
        FAQLink.click();
    }







}
