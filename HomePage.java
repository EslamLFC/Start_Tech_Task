package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    By InRoomDiningIcon = By.cssSelector("img[alt='In-Room Dining']");

    public WebElement Click_InRoomDining(){
        return driver.findElement(InRoomDiningIcon);
    }
}
