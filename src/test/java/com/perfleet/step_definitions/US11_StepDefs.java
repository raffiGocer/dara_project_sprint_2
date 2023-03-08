package com.perfleet.step_definitions;

import com.perfleet.pages.VehicleOdometerPage_RDG;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefs {

    VehicleOdometerPage_RDG vehicleOdometerPageRDG = new VehicleOdometerPage_RDG();
    Actions action = new Actions(Driver.getDriver());

    @When("users hover over the Fleet")
    public void usersHoverOverTheFleet() {
        BrowserUtils.sleep(1);
        action.moveToElement(vehicleOdometerPageRDG.fleetBtn).perform();
        BrowserUtils.sleep(2);

    }

    @When("users click the Vehicle Odometers under Fleet")
    public void users_click_the_vehicle_odometers_under_fleet() {
        BrowserUtils.sleep(1);
        vehicleOdometerPageRDG.vehicleOdometerBtn.click();
        BrowserUtils.sleep(2);

    }

    @Then("users verify managers see You do not have permission to perform this action")
    public void users_verify_managers_see_you_do_not_have_permission_to_perform_this_action() {
        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = vehicleOdometerPageRDG.message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }


    @When("users hover over the Fleet on driver dashboard")
    public void usersHoverOverTheFleetOnDriverDashboard() {
    BrowserUtils.sleep(2);
    action.moveToElement(vehicleOdometerPageRDG.driverFleetBtn).perform();
    BrowserUtils.sleep(1);
    }

    @When("users click the Vehicle Odometers under driver Fleet")
    public void usersClickTheVehicleOdometersUnderDriverFleet() {
        BrowserUtils.sleep(2);
        vehicleOdometerPageRDG.driverVehicleOdometerBtn.click();
        BrowserUtils.sleep(2);

    }

    @Then("users verify the default page number is one")
    public void usersVerifyTheDefaultPageNumberIsOne() {
    vehicleOdometerPageRDG.pageNumber.getAttribute("value").equals("1");
    }

    @Then("users verify the default view per page is twentyFive")
    public void usersVerifyTheDefaultViewPerPageIsTwentyFive() {
        vehicleOdometerPageRDG.pageDropDown.getText().equals("25");

    }
}

