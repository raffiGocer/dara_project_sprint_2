package com.perfleet.pages;

import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEvent {
    public static BrowserUtils BrowserUtils;

    public CalendarEvent(){
 PageFactory.initElements(Driver.getDriver(),this);
}
   @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/a/span")
    public WebElement activitiesModule;

   @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public WebElement calendarEvents;

   @FindBy(xpath = "//a[@title='Create Calendar event']")
    public static WebElement createCalendarEventButton;

   @FindBy(xpath = "//input[@id='recurrence-repeat-view168']")
    public WebElement repeatCheckboxInput;

   @FindBy(xpath = "//input[@name='temp-validation-name-192']")
    public WebElement repeatEveryInputSpace;

   @FindBy(xpath = "//span[contains(text(),'The value have not to be more than 99.')]")
    public WebElement greaterThan99;

   @FindBy(xpath = "//span[contains(text(),'The value have not to be less than 1.')]")
    public WebElement lessThan1;
}
