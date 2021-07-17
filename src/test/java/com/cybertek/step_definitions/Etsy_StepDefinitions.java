package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {
    @Given("user is on the Etsy landing page")
    public void userIsOnTheEtsyLandingPage() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("user should see Etsy title as expected")
    public void userShouldSeeEtsyTitleAsExpected() {
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not as expected", actualTitle.equals(expectedTitle));

    }
     EtsySearchPage etsySearchPage=new EtsySearchPage();
    @When("user types Wooden Spoon in the search bar")
    public void userTypesWoodenSpoonInTheSearchBar() {
        etsySearchPage.searchBar.sendKeys("wooden spoon");

    }

    @And("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        etsySearchPage.searchButton.click();
    }

    @Then("user sees title is Wooden spoon | Etsy")
    public void userSeesTitleIsWoodenSpoonEtsy() {
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected!", actualTitle, expectedTitle);


    }
}
