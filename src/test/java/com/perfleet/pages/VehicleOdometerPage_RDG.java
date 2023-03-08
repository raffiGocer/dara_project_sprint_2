package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage_RDG {

    public VehicleOdometerPage_RDG() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[text()='Vehicle Odometer']")
    public WebElement vehicleOdometerBtn;



    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement message;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement driverFleetBtn;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicle Odometer']")
    public WebElement driverVehicleOdometerBtn;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement pageNumber;

    @FindBy(xpath = "//button[@data-toggle='dropdown'][1]")
    public WebElement pageDropDown;


}
