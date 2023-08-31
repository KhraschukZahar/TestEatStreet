package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EatStreetHomePage extends BasePage {
    public EatStreetHomePage(WebDriver driver){
        super(driver);
    }

    private static final Duration BASE_TIME = Duration.ofMillis(3000);
    WebDriverWait wait = new WebDriverWait(driver,BASE_TIME);

    public WebElement getLogoImage(){
        return driver.findElement(By.xpath("//a[@ui-sref='landing']"));
    }
    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@id = 'home-checkbox-delivery']"));
    }

    public WebElement getButtonCart(){
        return driver.findElement(By.xpath("//a[text()='Cart ']"));
    }

    public WebElement getButtonGotIt(){
        return driver.findElement(By.xpath("//button[text()='Got it']"));
    }


    public WebElement getCloseButtonGotIt(){
        return driver.findElement(By.xpath("//img[@src='https://static.eatstreet.com/redesign/img/logos/es-logo-with-trademark.svg']"));
    }

    public EatStreetHomePage clickButtonCart(){ //return type структурований код(уникнути повторного виклику об'єкту створеного класу)
        getButtonCart().click();
        return this;
    }

    public  EatStreetHomePage  clickButtonGotIt(){
        getButtonGotIt().click();
        return this;
    }
    public EatStreetHomePage closeGotItButton(){
        getCloseButtonGotIt().click();
        return this;
    }
}
