package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;
    private final String emailBox = "(//*[@type=\"email\"])[2]";
    private final String passwordBox = "(//*[@type=\"password\"])[1]";
    private String girisYapButton = "(//*[@value=\"Giriş yap\"])[1]";
    private final CharSequence emailInfo = "r514q.test@inbox.testmail.app";
    private final CharSequence passwordInfo = "M4ae$GrhXZ+hLQS";


    // Constants
    public LoginPage() {
        driver = Driver.getDriver();
    }

    public void clickGirisYapLink() {
        driver.findElement(By.cssSelector("header  div > a:nth-child(2)")).click();
    }

    public void enterEmailAddressAndPassword() {
        driver.findElement(By.xpath(emailBox)).sendKeys(emailInfo);
        driver.findElement(By.xpath(passwordBox)).sendKeys(passwordInfo);

    }

    public void clickGirisYapButton() {
        driver.findElement(By.xpath(girisYapButton)).click();

    }


}
