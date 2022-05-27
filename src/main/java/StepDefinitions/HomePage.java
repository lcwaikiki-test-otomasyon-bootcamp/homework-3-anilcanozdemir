package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class HomePage {
    WebDriver driver = DriverFactory.getDriver();
    Pages.HomePage homePage = new Pages.HomePage();

    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {
        driver.get("https://www.lcwaikiki.com");
        homePage.checkHomePageContainer();
    }

    @When("click {string} card in the top rigt")
    public void clickCardInTheTopRigt(String arg0) {
        homePage.clickCard(arg0);
    }
}
