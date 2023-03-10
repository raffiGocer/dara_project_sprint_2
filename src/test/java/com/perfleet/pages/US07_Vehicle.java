package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class US07_Vehicle {

    public US07_Vehicle() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath = "(//span[contains(text(),'Fleet')])[1]")
//    public WebElement fleet_hover;

    @FindBy(xpath = "//thead[@class='grid-header']//input[@type='checkbox']")
    public WebElement first_checkbox;

    @FindBy(xpath = "//tr//input[@type='checkbox']")
    public List<WebElement> checkboxList;

}