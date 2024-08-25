package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class MainPage {

    private static WebDriver driver;

    // Constants
    private final String nav_to_mainpage = "https://www.akakce.com/";


    public MainPage() { driver = Driver.getDriver();
    }
    public void navigateToWebSite() {
        driver.get(nav_to_mainpage);
    }

    public void verifyThatHomePageIsDisplayedSuccessfully() {
        String siteName = driver.getCurrentUrl();
        checkUrl(siteName, nav_to_mainpage);
    }

    private void checkUrl(String siteName, String s_mainpage) {
        Assert.assertEquals(siteName, s_mainpage);
    }





}
