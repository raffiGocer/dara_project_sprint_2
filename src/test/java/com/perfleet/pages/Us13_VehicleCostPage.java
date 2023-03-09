package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Us13_VehicleCostPage {
    public Us13_VehicleCostPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Costs']")
    public WebElement vehicleCostButton;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement displayPage;

    @FindBy(xpath = "//thead[@class='grid-header']//span[@class='grid-header-cell__label'][normalize-space()='Type']")
    public WebElement type;

    @FindBy(xpath = "//span[@class='grid-header-cell__label'][normalize-space()='Total Price']")
    public WebElement totalPrice;

    @FindBy(xpath = "//span[@class='grid-header-cell__label'][normalize-space()='Date']")
    public WebElement date;

    @FindBy(xpath = "//tr[@class='grid-header-row']//th//a")
    public List<WebElement> columnsNames;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//tbody[@class='grid-body']//input[@type='checkbox']")
    public List<WebElement> allCheckBox;
}

////span[@class='title title-level-1']/i[@class='fa-asterisk menu-icon']