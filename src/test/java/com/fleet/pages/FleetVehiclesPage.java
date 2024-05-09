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

    @FindBy(xpath = "//ul//li[@class='launcher-item']//*[contains(@title,'View')]")
    public WebElement viewIcon;

    @FindBy(xpath = "(//ul//li[@class='launcher-item']//*[contains(@title,'Edit')])[1]")
    public WebElement editIcon;

    @FindBy(xpath = "(//ul//li[@class='launcher-item']//*[contains(@title,'Delete')])[1]")
    public WebElement deleteIcon;





   









}
