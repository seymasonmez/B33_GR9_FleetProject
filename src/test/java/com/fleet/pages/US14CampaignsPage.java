package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US14CampaignsPage {

    public US14CampaignsPage() { PageFactory.initElements(Driver.getDriver(), this); }

    public void isWebElementDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "//b")
    public List<WebElement> allFilters;

    @FindBy(xpath = "//b")
    public WebElement nameFilter;

    @FindBy(xpath = "(//b)[2]")
    public WebElement codeFilter;

    @FindBy (xpath = "(//b)[3]")
    public WebElement startDateFilter;

    @FindBy (xpath = "(//b)[4]")
    public WebElement endDateFilter;

    @FindBy (xpath = "(//b)[5]")
    public WebElement budgetFilter;

}
