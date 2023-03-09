package com.perfleet.step_definitions;

import com.perfleet.pages.Us13_VehicleCostPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Us13_VehicleCostPageFilterDefs {


    Us13_VehicleCostPage vehicleCostPage = new Us13_VehicleCostPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user hover over the Fleet button")
    public void user_hover_over_the_fleet_button() {
        BrowserUtils.sleep(2);

        actions.moveToElement(vehicleCostPage.fleetButton).perform();
        BrowserUtils.sleep(2);

    }
    @Then("user clicks the Vehicle Cost button under the Fleet button")
    public void user_clicks_the_vehicle_cost_button_under_the_fleet_button() {
        BrowserUtils.sleep(2);
        vehicleCostPage.vehicleCostButton.click();
    }

    @Then("user verify there are three columns in the table")
    public void user_verify_there_are_in_the_table() {

        for (WebElement each : vehicleCostPage.columnsNames) {
            each.isDisplayed();
        }
    }

    @Then("user clicks the first checkbox")
    public void user_clicks_the_first_checkbox() {
        vehicleCostPage.checkBox.click();
    }
    @Then("user verify all the vehicle costs are checked")
    public void user_verify_all_the_vehicle_costs_are_checked() {
        for (WebElement each : vehicleCostPage.allCheckBox) {
            each.isSelected();

        }
    }


}
/*
@Then("user display Vehicle cost page")
    public void user_display_vehicle_cost_page() {
        String actualResult = vehicleCostPage.displayPage.getText();
        String expectedResult = "All Vehicle Costs";
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedResult,actualResult);
 */
