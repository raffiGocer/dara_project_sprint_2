package com.perfleet.step_definitions;

import com.perfleet.pages.Dashboard_Alex;
import com.perfleet.pages.Vehicle_Alex;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class SelectAnyVehicles {

    Dashboard_Alex dashboard_alex = new Dashboard_Alex();
    Actions action = new Actions(Driver.getDriver());
    Vehicle_Alex vehicle_alex = new Vehicle_Alex();


    @And("Click the vehicle under the Fleet")
    public void clickTheVehicleUnderTheFleet() {

        BrowserUtils.sleep(3);
        action.moveToElement(dashboard_alex.fleet_hover).perform();
        dashboard_alex.vehicles_btn.click();
    }

    @When("user is on the Vehicle page")
    public void userIsOnTheVehiclePage() {
    }

    @Then("all checkboxes on the Vehicle page are unchecked")
    public void allCheckboxesOnTheVehiclePageAreUnchecked() {

        BrowserUtils.sleep(3);
        for (WebElement checkbox : vehicle_alex.checkboxList) {
            Assert.assertFalse(checkbox.isSelected());
        }

    }

    @When("user click the first checkbox in the web-table")
    public void userClickTheFirstCheckboxInTheWebTable() {

        BrowserUtils.sleep(3);
        vehicle_alex.first_checkbox.click();
        Assert.assertTrue(vehicle_alex.first_checkbox.isSelected());

    }

    @Then("all check boxes are checked")
    public void allCheckBoxesAreChecked() {

        BrowserUtils.sleep(3);
        for (WebElement checkbox : vehicle_alex.checkboxList) {
            checkbox.isSelected();
        }

    }

    @When("user click any car checkbox")
    public void userClickAnyCarCheckbox() {
        //String[] array = set.toArray(new String[set.size()]);
        Random rand = new Random();
        int index1 = rand.nextInt(vehicle_alex.checkboxList.size());

        vehicle_alex.checkboxList.get(index1).click();
        BrowserUtils.sleep(5);

        Assert.assertTrue("passed", vehicle_alex.checkboxList.get(index1).isSelected());


    }

    @Then("checkbox is checked")
    public void checkboxIsChecked() {

    }
}
