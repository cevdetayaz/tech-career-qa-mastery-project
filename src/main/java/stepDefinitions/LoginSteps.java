package stepDefinitions;

import PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @When("Click Giris Yap Link")
    public void clickGirisYapLink() {
        loginPage.clickGirisYapLink();
    }

    @And("Enter email address and password")
    public void enterEmailAddressAndPassword() {
        loginPage.enterEmailAddressAndPassword();
    }

    @And("Click Giris Yap button")
    public void clickGirisYapButton() {
        loginPage.clickGirisYapButton();
    }


}
