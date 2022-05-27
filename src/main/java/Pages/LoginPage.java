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
       if (driver.findElement(By.className("login-form__title")).getText().equals(arg0)){
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
        if (driver.findElement(By.name("email")).getAttribute("placeholder").equals(arg0))
            return;
        else
            throw new Exception("checkTextOnEmail");

    }

    public void checkTextOnPassword(String arg0) throws Exception {
        if(driver.findElement(By.name("password")).getAttribute("placeholder").equals(arg0))
            return;
        else
            throw new Exception("checkTextOnPassword");
    }

    public void checkShowPasswordIcon() {
        driver.findElement(By.className("login-form__show-password-icon"));
    }

    public void checkRememberMe(String arg0) throws Exception {
        if (driver.findElement(By.className("checkbox-span")).getText().equals(arg0))
            return;
        else
        throw new Exception("checkRememberMe");
    }

    public void checkForgotPassword(String arg0) throws Exception {
        if (driver.findElement(By.className("login-form__forgot-password-link")).getText().equals(arg0))
            return;
        else
            throw new Exception("checkRememberMe");
    }

    public void checkLoginButton(String arg0) throws Exception {
        if (driver.findElement(By.cssSelector("#login > div > div > div > div > form > button")).getText().equals(arg0))
            return;
        else
            throw new Exception("checkRememberMe");
    }

    public void checkPhoneTextBox() {
        driver.findElement(By.id("phone"));

    }

    public void clickLogin() {
        driver.findElement(By.cssSelector("#login > div > div > div > div > form > button")).click();
    }

    public void checkEmailEmptyMessage(String arg0) throws Exception {
        List <WebElement> webElementList= driver.findElements(By.className("error"));
        for (WebElement webElement:webElementList
             ) {
            if (webElement.getText().equals(arg0))
                return;

        }


            throw new Exception("checkRememberMe");
    }

    public void checkPasswordEmptyMessage(String arg0) throws Exception {
        List <WebElement> webElementList= driver.findElements(By.className("error"));
        for (WebElement webElement:webElementList
        ) {
            if (webElement.getText().equals(arg0))
                return;

        }


        throw new Exception("checkRememberMe");
    }

    public void typeEmail(String arg0) {
        driver.findElement(By.name("email")).sendKeys(arg0);
    }

    public void shouldNotSeeEmailEmptyMessage() throws Exception {

    }

    public void typePassword(String arg0) {
        driver.findElement(By.name("password")).sendKeys(arg0);
    }

    public void shouldNotSeePasswordEmptyMessage() {
    }

    public void shouldNotSeeFalseMessage(String arg0) {
    }

    public void checkLoginErrorMessage(String arg0) {
    }
}
