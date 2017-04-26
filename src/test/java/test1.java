//import org.junit.Assert;
import com.boxed.config.Config;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.boxed.Pages.LoginPage;
import com.boxed.Pages.HomePage;
import com.boxed.Pages.FAQPage;

import java.util.concurrent.TimeUnit;

public class test1 { //class
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("www.boxed.com");
    }
    @Test

    public void test(){




















    }


}
