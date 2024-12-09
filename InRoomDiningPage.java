package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InRoomDiningPage {
    WebDriver driver;
    public InRoomDiningPage(WebDriver driver){
        this.driver = driver;
    }
    By FirstCategory = By.cssSelector("div[class='carousel-item-custom carousel-restaurant noSelect']");
    By SubCategory = By.cssSelector("div[class='bg-layer']");
    By AddToCartBtn = By.cssSelector("button[class='add-button EN btn btn-primary']");
    By AddToCartFinalBtn = By.cssSelector("i[class='fa fa-plus-square']");

    public WebElement Click_Category(){
        return driver.findElements(FirstCategory).get(1);
    }
    public WebElement Click_SubCategory(){
        return driver.findElements(SubCategory).get(2);
    }
    public WebElement ClickAddBtn(){
        return driver.findElements(AddToCartBtn).get(0);
    }
    public WebElement ClickAddFinalBtn(){
        return driver.findElement(AddToCartFinalBtn);
    }

}
