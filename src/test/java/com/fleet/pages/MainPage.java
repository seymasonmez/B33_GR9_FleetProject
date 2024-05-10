package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Fleet Management")
    public WebElement header;

    @FindBy(partialLinkText = "Fleet")
    public WebElement fleetTab;

    @FindBy(partialLinkText = "Customers")
    public WebElement customersTab;

    @FindBy(partialLinkText = "Activities")
    public WebElement activitiesTab;

    @FindBy(partialLinkText = "System")
    public WebElement systemTab;

    @FindBy(partialLinkText = "Marketing")
    public WebElement marketingTab;

    @FindBy(partialLinkText = "Sales")
    public WebElement salesTab;

    @FindBy(partialLinkText = "Reports & Segments")
    public WebElement reportsSegmentsTab;

    @FindBy(partialLinkText = "Dashboards")
    public WebElement dashboardsTab;

    /**
     * Element Display assertion
     */
    public void isWebElementDisplayed(WebElement element) {
         Assert.assertTrue(element.isDisplayed());
    }
}
