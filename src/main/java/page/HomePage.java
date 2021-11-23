package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By solucionesMenu =By.xpath("//div[@id='w-dropdown-toggle-2']/div[@class='zu-header__dropdown-link-text']");
    private By expressParaRestaurantesLink = By.xpath("//*[@id='w-dropdown-list-2']/div/a[3]/div/div");

    public void selectFormDropDown(){
       waitForAnElement(expressParaRestaurantesLink);
       driver.findElement(expressParaRestaurantesLink).click();
    }

    public void waitForAnElement(By element){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }
    public RestaurantesPage navigateToExpressParaRestaurantes(){

        driver.findElement(solucionesMenu).click();
        selectFormDropDown();
        return new RestaurantesPage(driver);
    }

    public void navigateToHome(){
        driver.get("https://www.zubale.com/mx");

    }


}
