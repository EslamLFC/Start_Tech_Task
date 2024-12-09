package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    WebDriver driver;
    public Cart(WebDriver driver) {
        this.driver = driver;
    }
    By CartBtn = By.id("Group_37949");
    By NameField = By.cssSelector("input[placeholder='Your Name(Optional)']");
    By EmailField = By.cssSelector("input[placeholder='Your Email(Optional)']");
    By Checkbox = By.cssSelector("[type='checkbox']");
    By OrderBtn = By.cssSelector("button[type='submit']");
    By BackHomeBtn = By.cssSelector("a[class='reg-btn large']");
    public WebElement OpenCart(){
        return driver.findElement(CartBtn);
    }
    public WebElement EnterName(){
        return driver.findElement(NameField);
    }
    public WebElement EnterEmail(){
        return driver.findElement(EmailField);
    }
    public WebElement CheckAgree(){
        return driver.findElement(Checkbox);
    }
    public WebElement PlaceOrder(){
        return driver.findElement(OrderBtn);
    }
    public WebElement BackButtonAssertion(){
        return driver.findElement(BackHomeBtn);
    }
}
