package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_CalendarEventsPage_AD extends BasePage{

    public US10_CalendarEventsPage_AD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventModule;
    @FindBy(xpath = "(//div[@class='btn-group'])[1]/a")
    public WebElement createCalendarEventBtn;
    @FindBy(tagName = "iframe")
    public WebElement iframe;
    @FindBy(id = "tinymce")
    public WebElement descriptionBox;
    @FindBy(tagName = "p")
    public WebElement textInDescriptionBox;
}
