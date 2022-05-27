package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPage {

    Pages.LoginPage  loginPage=new Pages.LoginPage();
    WebDriver driver= DriverFactory.getDriver();

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginPage.checkLogin();
    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");

        loginPage.checkLogin();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) throws Exception {
        loginPage.clickRadioButton(arg0);
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) throws Exception {
        loginPage.checkLoginFormTitle(arg0);
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String arg0) throws Exception {
        loginPage.checkRadioButton(arg0);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String arg0) throws Exception {
        loginPage.checkTextOnEmail(arg0);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String arg0) throws Exception {
        loginPage.checkTextOnPassword(arg0);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginPage.checkShowPasswordIcon();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String arg0) throws Exception {
        loginPage.checkRememberMe(arg0);
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String arg0) {
        loginPage.checkForgotPassword(arg0);
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String arg0) {
        loginPage.checkLoginButton(arg0);
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginPage.checkPhoneTextBox();
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String arg0) {
        loginPage.checkEmailEmptyMessage(arg0);
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String arg0) {
        loginPage.checkPasswordEmptyMessage(arg0);
    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        loginPage.typeEmail(arg0);
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
    }

    @When("type Password {string}")
    public void typePassword(String arg0) {
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String arg0) {
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String arg0) {
        loginPage.checkEmailFalseMessage();
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String arg0, String arg1) {
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String arg0) throws Exception {
        loginPage.checkRadioButton(arg0);
    }
}
