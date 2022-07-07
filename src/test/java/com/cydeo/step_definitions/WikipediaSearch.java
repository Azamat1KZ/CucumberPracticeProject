package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaHomePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaSearch {
    WikipediaHomePage wikipediaSearchPage = new WikipediaHomePage();

    @Given("user is on Wikipedia homepage")
    public void user_is_on_wikipedia_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wiki.url"));
    }
    @When("user types {string} in search box and clicks enter")
    public void user_types_in_search_box_and_clicks_enter(String string) {
       wikipediaSearchPage.wikiSearchBox.sendKeys("Steve Jobs");
       wikipediaSearchPage.wikiSearchBtn.click();
    }
    @Then("user sees {string} on wikipedia title")
    public void user_sees_on_wikipedia_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("user sees {string} in header")
    public void userSeesInHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader, wikipediaSearchPage.wikiHeader.getText());
    }

    @Then("user sees {string} in image header")
    public void userSeesInImageHeader(String expectedImageHeader) {
        Assert.assertEquals(expectedImageHeader, wikipediaSearchPage.wikiImageHeader.getText());
    }
}
