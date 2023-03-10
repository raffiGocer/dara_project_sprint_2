package com.perfleet.step_definitions;

import com.perfleet.pages.CustomerInfo_AF;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US12_CustomerInfoStepDef {

    CustomerInfo_AF customerInfo_Af = new CustomerInfo_AF();
    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks the {string} under the Customers")
    public void user_clicks_the_under_the_customers(String string) {
        BrowserUtils.sleep(1);
        actions.moveToElement(customerInfo_Af.customerBtn).perform();
        BrowserUtils.sleep(1);

    }

    @Then("user verify there are {int} filter options : Account Name, Contact Name,Contact Email, Contact Phone, Owner, Business Unit, Created At, Updated At")
    public void user_verify_there_are_filter_options_account_name_contact_name_contact_email_contact_phone_owner_business_unit_created_at_updated_at(Integer int1) {
        BrowserUtils.sleep(1);
        actions.moveToElement(customerInfo_Af.accountsBtn).click();
        BrowserUtils.sleep(1);

    }
}