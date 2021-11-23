package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class PageFactory {

    public static WebDriver GetBrowser(String browserName) {
        browserName = browserName.toLowerCase();

        if(browserName.equals("chrome"))
            return getChromeInstance();
        else
            return getFFInstance();
    }

    private static FirefoxDriver getFFInstance() {

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette",true);
        //options.setHeadless(true); //Comment this line in order to run opening the browser
        FirefoxDriver driver = new FirefoxDriver(options);
        return driver;
    }

    private static ChromeDriver getChromeInstance() {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");  //Comment this line in order to run opening the browser
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }

}
