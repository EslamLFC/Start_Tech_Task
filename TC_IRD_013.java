import Pages.Cart;
import Pages.HomePage;
import Pages.InRoomDiningPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static PageResources.Resources.*;

public class TC_IRD_013 {
    WebDriver driver;
    HomePage data;
    InRoomDiningPage data1;
    Cart data2;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        data = new HomePage(driver);
        data1 = new InRoomDiningPage(driver);
        data2 = new Cart(driver);
    }

    @Test
    public void TestCase_013() throws InterruptedException{
        Thread.sleep(5000);
        data.Click_InRoomDining().click();
        Thread.sleep(3000);
        data1.Click_Category().click();
        Thread.sleep(3000);
        data1.Click_SubCategory().click();
        Thread.sleep(3000);
        data1.ClickAddBtn().click();
        Thread.sleep(4000);
        data1.ClickAddFinalBtn().click();
        Thread.sleep(4000);
        data2.OpenCart().click();
        Thread.sleep(5000);
        data2.EnterName().sendKeys(Name);
        data2.EnterEmail().sendKeys(Email);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        Actions action = new Actions(driver);
        action.click(data2.CheckAgree()).build().perform();
        data2.PlaceOrder().click();
        Thread.sleep(6000);
        Assert.assertTrue(data2.BackButtonAssertion().getText().contains("Back to Home"));
    }

    @AfterClass
    public void teardown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
