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


public class changeFAQtoSpanish {

    WebDriver driver = new FirefoxDriver();
    LoginPage loginPage;
    HomePage homePage;
    FAQPage faqPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("Pages.gecko.driver", "C:\\Webdrivers\\GeckoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("www.boxed.com");
    }

    @Test

    public void changeFAQtoSpanishandVerify()

    {
       
        driver.get("https://www.boxed.com");

        loginPage= new LoginPage(driver);
        loginPage.enterEmailNavtoHomePage();
        System.out.print("Poop");

        homePage = new LoginPage(driver);
        homePage.clickFAQLink();
        
        faqPage = new FAQPage(driver);
        faqPage.clickEspanolToggle();
        Assert.assertTrue(faqPage.getGeneralQuestionsText().toLowerCase().contains("Preguntas Generales"));
        
        System.out.println("Language has sucessfully been changed to Spanish);
        driver.close();
        
        



    }
}
