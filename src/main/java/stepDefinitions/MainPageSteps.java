package stepDefinitions;

import PageObjectModel.MainPage;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @When("Navigate to Web Site")
    public void navigateToWebSite() {
        mainPage.navigateToWebSite();
    }

    @Then("Verify that home page is displayed successfully")
    public void verifyThatHomePageIsDisplayedSuccessfully() {
        mainPage.verifyThatHomePageIsDisplayedSuccessfully();
    }

    /* Test Run bittikten sonra chrome uygulamasını tamamen kapatır.
    Her hangi bir Steps dosyası içine yazılabilir. Senaryo sonunda çalışır.
    Senaryonun pass, failed olması farketmez. En sonda çalışır. */
    @After
    public void close() {
        Driver.TearDown();
    }
}
