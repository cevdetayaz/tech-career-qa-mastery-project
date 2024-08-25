package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class BookmarkPage {
    WebDriver driver;

    // Constants
    private String itemName = "";
    private final String searchBar = "//*[@id=\"q\"]";
    private final String searchBarInput = "//*[@id=\"q\"]";
    private final String searchResultPage = "https://www.akakce.com/arama/?q=samsung";
    private final CharSequence searchItemValue = "samsung";
    private final String clickNextPage = "//div[2]/p[2]/a[2]";
    private final String secondSearchResultPage = "https://www.akakce.com/arama/?q=samsung&p=2";
    private final String itemNameLocator = "//li[3]/a/span/h3";
    private final String thirdTakipEtButton = "(//span[text()='Takip Et'])[3]";
    private final String takipListemLocator = "//div/a[text()='Takip Listem']";
    private final String itemLocatorOnTakipList = "//li[2]/a/span/h3";
    private final String ucNoktaTakipListItem = "//li[2]/i[1]";
    private final String takibiBirakButton = "(//span[text()='Takibi Bırak'])[3]";
    private final String takibiBirakmaOnayi = "//div/div/button[2]";
    private final String takipListenizBos = "div.empty-follow-list > h2";

    public BookmarkPage() {
        driver = Driver.getDriver();
    }
    public void searchSpecificItemAsWrittenToSearchbar() {
        driver.findElement(By.xpath(searchBar)).click();
        // Arama alanına tıkladıktan sonra aranacak kelime girildi ve enter tuşlandı.
        driver.findElement(By.xpath(searchBarInput)).sendKeys(searchItemValue , Keys.ENTER);
    }

    public void verifyThatSearchResultDisplayed() {
        String pageName = driver.getCurrentUrl();
        // bulunduğu sayfayı doğrulamak için Assert kullandım.
        Assert.assertEquals(pageName, searchResultPage);
    }

    public void clickAndDisplaySecondPageOfSearchResults() {
        driver.findElement(By.xpath(clickNextPage)).click();
    }

    public void verifyThatSecondPageOfSearchResultsDisplayed() {
        String pageName = driver.getCurrentUrl();
        // bulunduğu sayfayı doğrulamak için Assert kullandım.
        Assert.assertEquals(pageName, secondSearchResultPage);
    }

    public void addThirdItemToTakipEttiklerim() {
        itemName = driver.findElement(By.xpath(itemNameLocator)).getText();
        driver.findElement(By.xpath(thirdTakipEtButton)).click();
    }

    public void clickToTakipListem() {
        driver.findElement(By.xpath(takipListemLocator)).click();
    }

    public void verifyThatItemIsDisplayedOnTheTakipListemPage() {
        /* ürün arama sayfasında ürünü takip listesine eklerken aynı zamanda ürün ismini de
        itemName objesi üzerinde saklayarak taşıdım. Takip Listesi sayfasında bulunan ürün ismi ile
        kıyaslama yaparak ürünün varlığını kontrol ettim. */
        Assert.assertEquals(itemName, driver.findElement(By.xpath(itemLocatorOnTakipList)).getText());
    }

    public void removeItemFormTakipEttiklerim() {
        driver.findElement(By.xpath(ucNoktaTakipListItem)).click();
        driver.findElement(By.xpath(takibiBirakButton)).click();
        /* Testi üst üste defalarca run ettiğimde gözlemlediğim bazı durumlarda takibi bırakma elementi DOM'da
        görünmesine rağmen tıklama işlemini yapamıyor.
        İmplicit wait yeterli olmuyor. Sanıyorum animasyon süresinin duruma negatif etkisi oluyor.
        Bu sebeple elementin görünürlüğünden emin olmak için aşağıdaki fonksiyonu kullandım.
        Elementi bulabilmek için 10 Saniyeye kadar bekleyerek sorunu çözdüm. */
        WebElement onayKutusu = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(takibiBirakmaOnayi)));
        // Bulunan element "onayKutusu" objesinde saklanır ardından click işlemi yapılır.
        onayKutusu.click();
    }

    public void verifyThatItemIsNotOnTheTakipEttiklerimList() {
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(takipListenizBos)));
        /* 1 ürünü takibe alıp tekrar kaldırdığımızdan ve takip listesinde başka ürün olmadığından
        sayfada "Takip listeniz şu anda boş!" yazısı görüntülenmektedir.
        Doğrulamayı bu yazının varlığını kontrol ederek yaptım. */
        Assert.assertEquals( firstResult.getText(), "Takip listeniz şu anda boş!");
    }
}
