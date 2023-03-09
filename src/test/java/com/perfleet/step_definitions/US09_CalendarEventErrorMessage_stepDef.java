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
CalendarModulePage_RFG calendar = new CalendarModulePage_RFG();
    CalendarEvent calendarModule = new CalendarEvent();
    Actions actions = new Actions(Driver.getDriver());

 /*   @When("user hovers over the Activities button")
    public void userHoversOverTheActivitiesButton() {
        BrowserUtils.sleep(3);
        actions.moveToElement(calendarModule.activitiesModule).perform();

    }
    @When("user selects and clicks Calendar Event under Activities module")
    public void user_selects_and_clicks_calendar_event_under_activities_module() {
        BrowserUtils.sleep(3);
        calendarModule.calendarEvents.click();

    }

    @When("user clicks the Create Calendar Event button")
    public void user_clicks_the_create_calendar_event_button() {
        BrowserUtils.sleep(3);
        CalendarEvent.createCalendarEventButton.click();

    }
    @When("user clicks Repeat checkbox")
    public void user_clicks_repeat_checkbox() {
        BrowserUtils.sleep(1);
        calendarModule.repeatCheckboxInput.click();
    }*/
 @And("user enters any number less then {int},like {string}")
 public void userEntersAnyNumberLessThenLike(String invalidInput) {
     calendarModule.repeatEveryInputSpace.sendKeys(invalidInput);

 }

    @And("user enters any number higher than {string}")
    public void userEntersAnyNumberHigherThan(String invalidNumber) {
        calendarModule.repeatEveryInputSpace.sendKeys(invalidNumber);

    }
    @Then("user sees an {string} error message is displayed")
    public void user_sees_an_error_message_is_displayed(String errorMessage) {

        String actualErrorMessage = calendarModule.lessThan1.getText();


        Assert.assertEquals(errorMessage,actualErrorMessage);
    }




    }


