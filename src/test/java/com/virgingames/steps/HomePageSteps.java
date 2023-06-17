package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {

    }
    @And("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().clickOnAcceptCookies();
    }

    @When("^I click on Online Slots catagory$")
    public void iClickOnOnlineSlotsCatagory() {
        new HomePage().clickOnOnlineSlots();
    }

    @Then("^I should navigate to Online Slots category page$")
    public void iShouldNavigateToOnlineSlotsCategoryPage() {
        String actualMessage = new OnlineSlotsPage().getOnlineSlotsText();
        String expectedMessage = "Play Online Slots at Virgin Games";
        Assert.assertEquals(expectedMessage,actualMessage,"Online Slots catagory page not loaded.");
    }


}
