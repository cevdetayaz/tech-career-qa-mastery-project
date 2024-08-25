# Cucumber Gherkin syntax kullanarak BDD (Behavior-driven development)
# Feature: test suite karşılığımızdır.
# Background: Her senaryo öncesi çalışacak aksiyonları barındırır.
# Scenario: senaryo yani testcase
# Given:
# When: Bir eylemin gerçekleştiği steplere yazılır.
# Then: Bir doğrulama vb işlem gerektiren steplere yazılır.
# And: Tekrar eden komutlar varsa kullanılır. Mesela 2 kere üste when ile başlayan stepler yazdığımda devam eden stepin
# yukarıdaki ile aynı olduğu durumlarda And kullanılabilir. Zorunlu değil.



Feature: TestCases

  Background:
    When Navigate to Web Site
    Then Verify that home page is displayed successfully

  Scenario: add item to Takip List and remove it
    When Click Giris Yap Link
    And Enter email address and password
    And Click Giris Yap button
    And Search specific item as written to searchbar
    Then Verify that search result displayed
    When Click and display second page of search results
    Then Verify that second page of search results displayed
    When Add third item to TakipEttiklerim
    And Click to Takip Listem
    Then Verify that item is displayed on the takip listem page
    When Remove item form TakipEttiklerim
    Then Verify that item is not on the TakipEttiklerim list

