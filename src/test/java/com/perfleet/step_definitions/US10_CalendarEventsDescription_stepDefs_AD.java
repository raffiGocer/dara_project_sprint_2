package com.perfleet.step_definitions;

import com.perfleet.pages.US10_CalendarEventsPage_AD;
import com.perfleet.pages.LoginPage;
import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_CalendarEventsDescription_stepDefs_AD {

    LoginPage loginPage = new LoginPage();
    US10_CalendarEventsPage_AD calendarEventsPage = new US10_CalendarEventsPage_AD();
    @When("user selects and clicks Calendar Event under Activities module on the home page")
    public void user_selects_and_clicks_calendar_event_under_activities_module_on_the_home_page() {
        calendarEventsPage.navigateToModule("Activities", "Calendar Events");
    }
    @When("user clicks the Create Calendar Event button AD")
    public void user_clicks_the_create_calendar_event_button() {
        BrowserUtils.sleep(5);
        calendarEventsPage.createCalendarEventBtn.click();
    }
    @When("user types  {string} in Description field")
    public void user_types_in_description_field(String string) {
        Driver.getDriver().switchTo().frame(calendarEventsPage.iframe);
        calendarEventsPage.descriptionBox.sendKeys(string);
    }
    @Then("user is able to see the text {string} in the Description field")
    public void user_is_able_to_see_the_text_in_the_description_field(String string) {
        Assert.assertEquals(string, calendarEventsPage.textInDescriptionBox.getText());
    }
}

