package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.DriverFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    By homePageContainer=By.id("container");
    By CardList=By.className("cart-dropdown");
    public HomePage()
    {
        driver = DriverFactory.getDriver();
    }

    public void checkHomePageContainer() {
        driver.findElement(homePageContainer);
    }

    public void clickCard(String arg0) {
        List<WebElement> webElementList =driver.findElements(CardList);

        for (WebElement webElement:webElementList
             )
        {

            if (arg0.equals(webElement.getText()))
            {
                webElement.click();
                break;
            }

        }

        
    }
}
