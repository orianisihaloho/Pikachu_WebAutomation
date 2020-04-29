package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaStepsDefinition {

    //OBJECT
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();

    @Given("User open Bulbapedia home page")
    public void userOpenBulbapediaHomePage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on home page")
    public void userInputSearchOnHomePage(String keyword) {

        homePage.inputSearch(keyword + Keys.ENTER);
    }
    @Then("User see pokemonName {string} on article page")
    public void userSeePokemonNameOnArticlePage(String PokemonName) {
        String actual = articlePage.getPokemonName();
        Assert.assertEquals(PokemonName,actual);
    }

    @And("User see pokemonNumber {string} on article page")
    public void userSeePokemonNumberOnArticlePage(String PokemonNumber) {
        String actual_num = articlePage.getPokemonNumber();
        Assert.assertEquals(PokemonNumber,actual_num);
    }


}
