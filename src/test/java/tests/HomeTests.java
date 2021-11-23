package tests;

import org.testng.annotations.Test;
import page.RestaurantesPage;

import static org.testng.Assert.assertTrue;

public class HomeTests extends BaseTests{

    @Test
    public void testNavigationToRestaurantesPage(){
        homePage.navigateToHome();
        RestaurantesPage restaurantesPage = homePage.navigateToExpressParaRestaurantes();
        assertTrue(restaurantesPage.isSolicitaloAhoraButtonDisplayed());

    }
}
