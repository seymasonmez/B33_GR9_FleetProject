package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetVehiclesPage {

    public FleetVehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "...")
    public WebElement dotsIcon;

    @FindBy(xpath = "//ul[contains(@data-options, 'true,')][.//a[@title='View']]")
    public WebElement viewIcon;

    @FindBy(xpath = "//ul[contains(@data-options, 'true,')][.//a[@title='Edit']]")
    public WebElement editIcon;

    @FindBy(xpath = "//ul[contains(@data-options, 'true,')][.//a[@title='Delete']]")
    public WebElement deleteIcon;








}
