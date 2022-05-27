package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverFactory;

import java.util.List;

public class LoginPage {
    WebDriver driver;
    By login = By.id("login");
    By loginButton=By.cssSelector("#login > div > div > div > div > form > button");
    By RadioButtons = By.className("login-form__radio-buttons--span");
    By loginFormTitle=By.className("login-form__title");
    By email=By.name("email");
    By error=By.className("error");
    By forgotPassword=By.className("login-form__forgot-password-link");
    By password=By.name("password");
    By showPasswordIcon=By.className("login-form__show-password-icon");

    public LoginPage() {
        driver = DriverFactory.getDriver();

    }

    public void checkLogin() {
        driver.findElement(login);
    }

    public void clickRadioButton(String arg0) throws Exception {
        List<WebElement> webElementList = driver.findElements(RadioButtons);
        for (WebElement webElement : webElementList
        ) {

            if (arg0.equals(webElement.getText())) {
                webElement.click();
                return;
            }

        }
        throw new Exception("clickRadioButton");

    }

    public void checkLoginFormTitle(String arg0) throws Exception {
        if (driver.findElement(loginFormTitle).getText().equals(arg0)) {
            return;
        } else {
            throw new Exception("checkLoginFormTitle");
        }
    }

    public void checkRadioButton(String arg0) throws Exception {
        List<WebElement> webElementList = driver.findElements(RadioButtons);
        for (WebElement webElement : webElementList
        ) {

            if (arg0.equals(webElement.getText())) {
                return;
            }

        }
        throw new Exception("checkRadioButton");
    }

    public void checkTextOnEmail(String arg0) throws Exception {
        if (driver.findElement(email).getAttribute("placeholder").equals(arg0))
            return;
        else
            throw new Exception("checkTextOnEmail");

    }

    public void checkTextOnPassword(String arg0) throws Exception {
        if (driver.findElement(password).getAttribute("placeholder").equals(arg0))
            return;
        else
            throw new Exception("checkTextOnPassword");
    }

    public void checkShowPasswordIcon() {
        driver.findElement(showPasswordIcon);
    }

    public void checkRememberMe(String arg0) throws Exception {
        if (driver.findElement(By.className("checkbox-span")).getText().equals(arg0))
            return;
        else
            throw new Exception("checkRememberMe");
    }

    public void checkForgotPassword(String arg0) throws Exception {
        if (driver.findElement(forgotPassword).getText().equals(arg0))
            return;
        else
            throw new Exception("checkRememberMe");
    }

    public void checkLoginButton(String arg0) throws Exception {
        if (driver.findElement(loginButton).getText().equals(arg0))
            return;
        else
            throw new Exception("checkRememberMe");
    }

    public void checkPhoneTextBox() {
        driver.findElement(By.id("phone"));

    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void checkEmailEmptyMessage(String arg0) throws Exception {
        List<WebElement> webElementList = driver.findElements(error);
        for (WebElement webElement : webElementList
        ) {
            if (webElement.getText().equals(arg0))
                return;

        }


        throw new Exception("checkRememberMe");
    }

    public void checkPasswordEmptyMessage(String arg0) throws Exception {
        List<WebElement> webElementList = driver.findElements(error);
        for (WebElement webElement : webElementList
        ) {
            if (webElement.getText().equals(arg0))
                return;

        }


        throw new Exception("checkRememberMe");
    }

    public void typeEmail(String arg0) {
        driver.findElement(email).sendKeys(arg0);
    }

    public void shouldNotSeeEmailEmptyMessage() throws Exception {
        System.out.println(driver.findElement(email).getAttribute("value")
        );
        if(driver.findElement(email).getAttribute("value").equals(""))
            throw new Exception("shouldNotSeeEmailEmptyMessage");
    }


    public void typePassword(String arg0) {
        driver.findElement(password).sendKeys(arg0);
    }

    public void shouldNotSeePasswordEmptyMessage() throws Exception {
        System.out.println(driver.findElement(password).getAttribute("value"));
        if(driver.findElement(password).getAttribute("value").equals(""))
        {
            throw new Exception("shouldNotSeePasswordEmptyMessage");
        }

    }


    public void checkLoginErrorMessage(String arg0) {
    }

    public void shouldSeeEmailFalseMessage(String arg0) throws Exception {
        List<WebElement> webElementList = driver.findElements(By.className("text-input input-error"));
        for (WebElement webElement : webElementList
        ) {
            if (webElement.getAttribute("name").equals("email"))
                throw new Exception("checkLoginErrorMessage");

        }



    }
}
