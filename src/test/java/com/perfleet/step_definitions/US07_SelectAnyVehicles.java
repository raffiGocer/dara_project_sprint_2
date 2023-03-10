package com.perfleet.step_definitions;

import com.perfleet.pages.US07_Dashboard;
import com.perfleet.pages.US07_Vehicle;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class US07_SelectAnyVehicles {

    US07_Dashboard dashboard_alex = new US07_Dashboard();
    Actions action = new Actions(Driver.getDriver());
    US07_Vehicle vehicle_alex = new US07_Vehicle();


    @And("Click the vehicle under the Fleet")
    public void clickTheVehicleUnderTheFleet() {

        BrowserUtils.sleep(5);
        action.moveToElement(dashboard_alex.fleet_hover).perform();
        BrowserUtils.sleep(1);
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

        Assert.assertTrue(vehicle_alex.checkboxList.get(index1).isSelected());


    }

    @Then("checkbox is checked")
    public void checkboxIsChecked() {

    }
}
