package tests;

import org.testng.annotations.Test;
import pageObjects.EatStreetHomePage;

public class TestEatStreet extends TestInit{

    @Test
    public void checkHeader(){
        EatStreetHomePage eatStreetHomePage = new EatStreetHomePage(driver);

        eatStreetHomePage
                .clickButtonGotIt()
                .clickButtonCart();
                 sleep(2);
        eatStreetHomePage
                .closeGotItButton();


        assertTrue(eatStreetHomePage.getButtonCart().isDisplayed());
    }
}
