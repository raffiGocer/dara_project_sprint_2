package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModulePage_RFG {
    public CalendarModulePage_RFG() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activitiesBtn;

    @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public WebElement calendarEventBtn;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalenderEventBtn;

    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "//label[@data-role='control-section-switcher']//input[@value='1']")
    public WebElement daysInputBox;

    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement blankMessage;
}
