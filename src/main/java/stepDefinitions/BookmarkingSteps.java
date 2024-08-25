package stepDefinitions;

import PageObjectModel.BookmarkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BookmarkingSteps {

    BookmarkPage bookmarkPage = new BookmarkPage();

    @And("Search specific item as written to searchbar")
    public void searchSpecificItemAsWrittenToSearchbar() {
        bookmarkPage.searchSpecificItemAsWrittenToSearchbar();
    }

    @Then("Verify that search result displayed")
    public void verifyThatSearchResultDisplayed() {
        bookmarkPage.verifyThatSearchResultDisplayed();
    }

    @When("Click and display second page of search results")
    public void clickAndDisplaySecondPageOfSearchResults() {
        bookmarkPage.clickAndDisplaySecondPageOfSearchResults();
    }

    @Then("Verify that second page of search results displayed")
    public void verifyThatSecondPageOfSearchResultsDisplayed() {
        bookmarkPage.verifyThatSecondPageOfSearchResultsDisplayed();
    }

    @When("Add third item to TakipEttiklerim")
    public void addThirdItemToTakipEttiklerim() {
        bookmarkPage.addThirdItemToTakipEttiklerim();
    }

    @And("Click to Takip Listem")
    public void clickToTakipListem() {
        bookmarkPage.clickToTakipListem();
    }

    @Then("Verify that item is displayed on the takip listem page")
    public void verifyThatItemIsDisplayedOnTheTakipListemPage() {
        bookmarkPage.verifyThatItemIsDisplayedOnTheTakipListemPage();
    }

    @When("Remove item form TakipEttiklerim")
    public void removeItemFormTakipEttiklerim() {
        bookmarkPage.removeItemFormTakipEttiklerim();
    }

    @Then("Verify that item is not on the TakipEttiklerim list")
    public void verifyThatItemIsNotOnTheTakipEttiklerimList() {
        bookmarkPage.verifyThatItemIsNotOnTheTakipEttiklerimList();
    }










}
