package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.HomePage;
import utils.PageFactory;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    //String browser = "chrome";
    String browser = "firefox";

    @BeforeClass
    public void setUp(){

        driver = PageFactory.GetBrowser(browser);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
