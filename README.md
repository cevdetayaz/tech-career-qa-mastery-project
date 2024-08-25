
# Selenium-Cucumber-BDD-TestNG-Usage-Demo

Merhaba,

Bu projede [akakce.com](https://www.akakce.com) sayfasını kullandım. Kullanıcı girişi, ürünü takibe alıp takipten kaldırma ve doğrulama işlemlerini otomasyona uyguladım.

Adımlar aşağıdaki gibidir:

1. Akakce.com sayfasına gidecek ve anasayfanin acildigini onaylayacak
2. Login ekranini acip, bir kullanici ile login olacak ( daha once siteye uyeliginiz varsa o olabilir )
3. Ekranin ustundeki Search alanina 'samsung' yazip Ara butonuna tiklayacak
4. Gelen sayfada samsung icin sonuc bulundugunu onaylayacak
5. Arama sonuclarindan 2. sayfaya tiklayacak ve acilan sayfada 2. sayfanin su an gosterimde oldugunu onaylayacak
6. Ustten 3. urunun icindeki 'favorilere ekle' butonuna tiklayacak
7. Ekranin en ustundeki 'favorilerim' linkine tiklayacak
8. Acilan sayfada bir onceki sayfada izlemeye alinmis urunun bulundugunu onaylayacak
9. Favorilere alinan bu urunun yanindaki 'Kaldir' butonuna basarak, favorilerimden cikaracak
10. Sayfada bu urunun artik favorilere alinmadigini onaylayacak.  

### Yararlanılan Teknolojiler
* Java 
* Selenium WebDriver (ChromeDriver 107.0.5304.62)
* Maven
* BDD
* Cucumber 
* TestNG 
* Windows 11 üzerinde Chrome 106 and 107 stable sürümlerinde test edilmiştir. 

### Kaynaklar
* https://www.selenium.dev/documentation/webdriver/
* https://mvnrepository.com/
* https://cucumber.io/docs/cucumber/