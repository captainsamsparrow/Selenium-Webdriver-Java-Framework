package com.boxed.Pages;

import com.boxed.config.Config;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class webdriverTest { //class

    @Test

    public void startWebDriver(){ //method

        System.setProperty("Pages.gecko.driver", "C:\\Webdrivers\\GeckoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://boxed.com");
        driver.findElement(By.className("g-brochure-email")).sendKeys(Config.email);
        driver.findElement(By.xpath(Config.goButton)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Config.espanolToggle));
       // driver.findElement(By.xpath(Config.grocery));



        //Assert.assertTrue("Title check",
        //        driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
