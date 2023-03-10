package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModule {
        //public static BrowserUtils BrowserUtils;

        public CalendarModule(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/a/span")
        public WebElement activitiesModule;

        @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
        public WebElement calendarEvents;

        @FindBy(xpath = "//a[@title='Create Calendar event']")
        public static WebElement createCalendarEventButton;

        @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
        public WebElement repeatCheckboxInput;

        @FindBy(xpath = "//label[@data-role='control-section-switcher']//input[@value='1']")
        public WebElement repeatEveryInputSpace;

        @FindBy(xpath = "//span[@class='validation-failed']")
        public WebElement greaterThan99;

        @FindBy(xpath = "//span[@class='validation-failed']")
        public WebElement lessThan1;
    }

