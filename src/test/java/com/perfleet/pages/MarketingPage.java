package com.perfleet.pages;

import com.perfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingPage {

    public MarketingPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Marketing']")
    public WebElement marketingBtn;

    @FindBy(xpath = "//a[@href='/campaign/']//span[@class='title title-level-2'][normalize-space()='Campaigns']")
    public WebElement campaignBtn;

    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement filterBtn;

    @FindBy(xpath = "//label[@class='ui-corner-all']")
    public List<WebElement> checkbox;


    @FindBy(xpath = "//input[contains(@id,'column-c')][1]")
    public WebElement nameCheckbox;

}
