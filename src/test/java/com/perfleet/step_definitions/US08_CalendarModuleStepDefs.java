package com.perfleet.step_definitions;

import com.perfleet.pages.CalendarModulePage_RFG;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US08_CalendarModuleStepDefs {
    CalendarModulePage_RFG calendarModulePageRFG = new CalendarModulePage_RFG();
    Actions actions = new Actions(Driver.getDriver());

    @When("user hover over the Activities button")
    public void userHoverOverTheActivitiesButton() {
        BrowserUtils.sleep(1);
        actions.moveToElement(calendarModulePageRFG.activitiesBtn).perform();
        BrowserUtils.sleep(1);

    }

    @When("user clicks the Calendar Event under the Activities button")
    public void user_clicks_the_calendar_event_under_the_activities_button() {
        BrowserUtils.sleep(1);
        calendarModulePageRFG.calendarEventBtn.click();
        BrowserUtils.sleep(1);


    }
    @When("user clicks the Create Calendar Event button")
    public void user_clicks_the_create_calendar_event_button() {
        BrowserUtils.sleep(1);
        calendarModulePageRFG.createCalenderEventBtn.click();
        BrowserUtils.sleep(1);

    }
    @When("user checks the repeat checkbox")
    public void user_checks_the_repeat_checkbox() {
        BrowserUtils.sleep(1);
        calendarModulePageRFG.repeatCheckbox.click();

    }
    @Then("user verifies the repeat number 1")
    public void user_verifies_the_repeat_number_1() {
        calendarModulePageRFG.daysInputBox.getText().equals("1");

    }


    @And("user clears the number 1")
    public void userClearsTheNumber_1() {
    calendarModulePageRFG.daysInputBox.clear();
    }

    @Then("user verifies the display message This value should not be blank.")
    public void userVerifiesTheDisplayMessageThisValueShouldNotBeBlank() {
     //calendarEventPage.blankMessage.isDisplayed();
        String expectedMessage = "This value should not be blank.";
        String actualMessage = calendarModulePageRFG.blankMessage.getText();

        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
