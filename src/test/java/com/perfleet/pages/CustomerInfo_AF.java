package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo_AF {

    public CustomerInfo_AF() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customerBtn;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[10]")
    public WebElement accountsBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[1]")
    public WebElement accountNameBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[2]")
    public WebElement contactNameBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[3]")
    public WebElement contactEmailBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[4]")
    public WebElement contactPhoneBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[5]")
    public WebElement ownerBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[6]")
    public WebElement businessUnitBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[7]")
    public WebElement createdAtBtn;

    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[8]")
    public WebElement updatedAtBtn;
}
