package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_Dashboard {
    public US07_Dashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Fleet')])[1]")
    public WebElement fleet_hover;

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    public WebElement vehicles_btn;


}
