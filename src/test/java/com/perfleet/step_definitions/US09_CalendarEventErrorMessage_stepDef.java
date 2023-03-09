package com.perfleet.step_definitions;

import com.perfleet.pages.CalendarEvent;
import com.perfleet.pages.CalendarModulePage_RFG;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US09_CalendarEventErrorMessage_stepDef {

    CalendarEvent calendarModule = new CalendarEvent();
    Actions actions = new Actions(Driver.getDriver());

    @When("user hovers over the Activities button")
    public void userHoversOverTheActivitiesButton() {
        BrowserUtils.sleep(1);
        actions.moveToElement(calendarModule.activitiesModule).perform();
        BrowserUtils.sleep(1);
    }
    @When("user selects and clicks Calendar Event under Activities module")
    public void user_selects_and_clicks_calendar_event_under_activities_module() {
        BrowserUtils.sleep(1);
        calendarModule.calendarEvents.click();
        BrowserUtils.sleep(1);
    }

    @When("user clicks the Create Calendar Event button")
    public void user_clicks_the_create_calendar_event_button() {
        BrowserUtils.sleep(1);
        CalendarEvent.createCalendarEventButton.click();
        BrowserUtils.sleep(1);
    }
    @When("user clicks Repeat checkbox")
    public void user_clicks_repeat_checkbox() {
        BrowserUtils.sleep(1);
        calendarModule.repeatCheckboxInput.click();
    }
    @When("user enters any number less then {string}")
    public void user_enters_any_number_less_then(String invalidInput) {

            calendarModule.repeatEveryInputSpace.sendKeys("-1");
        }



    @And("user enters any number higher than {string}")
    public void userEntersAnyNumberHigherThan(String invalidNumber) {
        calendarModule.repeatEveryInputSpace.sendKeys("134");

    }
    @Then("user sees an {string} error message is displayed")
    public void user_sees_an_error_message_is_displayed(String errorMessage) {
        String expectedErrorMessage = "The value have not to be less than 1";
        String actualErrorMessage = calendarModule.lessThan1.getText();

        String expectedErrorMessage1 = "The value have not to be more than 99";
        String actualErrorMessage1 = calendarModule.greaterThan99.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        Assert.assertEquals(expectedErrorMessage1,actualErrorMessage1);
    }






    }

