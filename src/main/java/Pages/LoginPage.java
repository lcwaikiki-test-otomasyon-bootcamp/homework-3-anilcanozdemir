package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import java.util.List;

public class LoginPage {
    WebDriver driver;
    By login=By.id("login");
    By RadioButtons=By.className("login-form__radio-buttons--span");
    public LoginPage()
    {
        driver = DriverFactory.getDriver();

    }

    public void checkLogin() {
        driver.findElement(login);
    }

    public void clickRadioButton(String arg0) throws Exception {
        List<WebElement> webElementList =driver.findElements(RadioButtons);
        for (WebElement webElement:webElementList
        )
        {

            if (arg0.equals(webElement.getText()))
            {
                webElement.click();
                return;
            }

        }
        throw new Exception("clickRadioButton");

    }

    public void checkLoginFormTitle(String arg0) throws Exception {
       if (driver.findElement(By.className("login-form__title")).getText().equals("arg0")){
            return;
       }

       else
       {
           throw new Exception("checkLoginFormTitle");
       }
    }

    public void checkRadioButton(String arg0) throws Exception {
        List<WebElement> webElementList =driver.findElements(RadioButtons);
        for (WebElement webElement:webElementList
        )
        {

            if (arg0.equals(webElement.getText()))
            {
                return;
            }

        }
        throw new Exception("checkRadioButton");
    }

    public void checkTextOnEmail(String arg0) throws Exception {
        if (driver.findElement(By.name("email")).getText().equals(arg0))
            return;
        else
            throw new Exception("checkTextOnEmail");

    }

    public void checkTextOnPassword(String arg0) throws Exception {
        if(driver.findElement(By.name("password")).getText().equals(arg0))
            return;
        else
            throw new Exception("checkTextOnPassword");
    }

    public void checkShowPasswordIcon() {
        driver.findElement(By.className("login-form__show-password-icon"));
    }

    public void checkRememberMe(String arg0) throws Exception {
        if (driver.findElement(By.className("checkbox-span")).getText().equals(arg0)
            return;
        else
        throw new Exception("checkRememberMe");
    }
}
