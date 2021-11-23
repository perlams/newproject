package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantesPage {

    private WebDriver driver;
    private By solicitaloAhoraButton = By.cssSelector("div.zu-home-hero__content > a");

    public RestaurantesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSolicitaloAhoraButtonDisplayed(){
        return driver.findElement(solicitaloAhoraButton).isDisplayed();
    }



}
