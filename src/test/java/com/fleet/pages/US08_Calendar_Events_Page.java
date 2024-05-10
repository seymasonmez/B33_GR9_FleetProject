package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_Calendar_Events_Page {
    public US08_Calendar_Events_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/a[contains(text(),'Create Calendar event')]")
    public WebElement CreateCalendarEvent;



    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckBox;


    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEveryDays;

    //(//span[text()='This value should not be blank.'])[2]
    @FindBy(xpath = "(//span[contains(@id,'temp-validation-name')])")
    public WebElement message;
//    @FindBy(xpath = "//div/a[contains(text(),'Create Calendar event')]")
//    public WebElement CreateCalendarEvent;
//
//
//    @FindBy(id ="input#recurrence-repeat-view2851")
//    public WebElement Repeat;
}
