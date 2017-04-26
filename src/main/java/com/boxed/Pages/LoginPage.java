package com.boxed.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id="g-brochure-email") WebElement emailTextBox;
    public static String email = "samantha.murray21@gmail.com";
    @FindBy(xpath="//button[@data-reactid='51']") WebElement goButton;


    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //-----------------action method constructors------------
    public void enterEmail(String email){

        emailTextBox.sendKeys(email);
    }

    public void clickGo(){

        goButton.click();
    }

    public void enterEmailNavtoHomePage(){
        enterEmail(email);
        clickGo();
    }

    //-----------getters-----------------------//





}
