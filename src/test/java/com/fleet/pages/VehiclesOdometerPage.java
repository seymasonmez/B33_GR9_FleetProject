package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOdometerPage {

    public VehiclesOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetModule;


    @FindBy(css = ".message")
    public WebElement errorMessage;


    @FindBy(xpath = "//input[@value='1']")
    public WebElement page;

    @FindBy(xpath = "(//div[@class='btn-group'])[3]/button")
    public WebElement viewPerPageButton;

}
