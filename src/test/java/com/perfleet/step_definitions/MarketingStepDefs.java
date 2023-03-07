package com.perfleet.step_definitions;

import com.perfleet.pages.MarketingPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MarketingStepDefs {

    MarketingPage marketingPage=new MarketingPage();
    Actions actions=new Actions(Driver.getDriver());


    @When("the user hovers over marketing button")
    public void the_user_hovers_over_marketing_button() {
        BrowserUtils.sleep(2);

        actions.moveToElement(marketingPage.marketingBtn).perform();
        BrowserUtils.sleep(2);

    }

    @When("the user clicks campaigns under marketing")
    public void the_user_clicks_campaigns_under_marketing() {
        BrowserUtils.sleep(2);

        marketingPage.campaignBtn.click();
    }
    @When("the user clicks the manage filters button")
    public void the_user_clicks_the_manage_filters_button() {
        BrowserUtils.sleep(2);
        marketingPage.filterBtn.click();

    }
    @Then("the user verifies five options are checked by default")
    public void the_user_verifies_five_options_are_checked_by_default() {
        for (WebElement each : marketingPage.checkbox) {
            each.isSelected();
        }

    }

    @And("the user uncheck one or more filter options")
    public void theUserUncheckOneOrMoreFilterOptions() {

        marketingPage.nameCheckbox.click();
        BrowserUtils.sleep(2);
        }


    @Then("the user verifies one or more options are unchecked")
    public void theUserVerifiesOneOrMoreOptionsAreUnchecked() {
    Assert.assertFalse(marketingPage.nameCheckbox.isSelected());
    }
}
